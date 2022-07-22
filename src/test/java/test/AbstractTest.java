package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import utils.SingletonWebDriver;

public abstract class AbstractTest {
    private static final WebDriver WEB_DRIVER = SingletonWebDriver.getWebDriver();
    private static final String URL = "https://catalog.onliner.by/tv";

    @Before
    public void openSite() {
        WEB_DRIVER.get(URL);
    }

    @After
    public void afterTest() {
        SingletonWebDriver.driverQuit();
    }
}