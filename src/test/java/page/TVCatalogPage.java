package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Utils;

import java.util.List;
import java.util.stream.Collectors;

public class TVCatalogPage extends AbstractPage {
    private final By productFullNameLocator = By.xpath("//span[@data-bind='html: product.extended_name || " +
            "product.full_name' or @data-bind='html: children.extended_name || children.full_name']");
    private final String manufacturerXpathPattern = "//input[@type='checkbox' and @value='%s']/ancestor::label";

    public TVCatalogPage chooseManufacturer(Manufacturer manufacturer) {
        String xpathValue = manufacturer.getXpathValue();
        By xpath = By.xpath(String.format(manufacturerXpathPattern, xpathValue));
        Utils.scrollToElement(xpath);
        webDriver.findElement(xpath)
                .click();
        return this;
    }

    public List<String> getProductNames() {
        return webDriver.findElements(productFullNameLocator)
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}