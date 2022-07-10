package page;

import org.openqa.selenium.WebDriver;
import utils.SingletonWebDriver;

public abstract class AbstractPage {
    protected final WebDriver webDriver = SingletonWebDriver.getWebDriver();
}