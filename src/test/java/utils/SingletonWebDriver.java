package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonWebDriver {
    private static WebDriver webDriver;

    private SingletonWebDriver() {
    }

    public static WebDriver getWebDriver() {
        if (webDriver == null) {
            webDriver = WebDriverManager.chromedriver().create();
            webDriver.manage().window().maximize();
        }
        return webDriver;
    }

    public static void driverQuit(){
        webDriver.quit();
        webDriver = null;
    }
}