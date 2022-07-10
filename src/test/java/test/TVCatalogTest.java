package test;

import org.junit.Assert;
import org.junit.Test;
import page.Manufacturer;
import page.TVCatalogPage;
import utils.Utils;

import java.util.List;

public class TVCatalogTest extends AbstractTest {
    private final TVCatalogPage tvCatalogPage = new TVCatalogPage();

    @Test
    public void test() {
        Utils.sleep(5);
        TVCatalogPage tvCatalogPage1 = tvCatalogPage.chooseManufacturer(Manufacturer.LG);
        Utils.sleep(5);
        List<String> productNames = tvCatalogPage1.getProductNames();
        boolean isProductNamesCorrect = Utils.isListElementsContainsString(productNames, Manufacturer.LG.getName());
        Assert.assertTrue(isProductNamesCorrect);
    }
}