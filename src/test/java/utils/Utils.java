package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Utils {

    public static final WebDriver WEB_DRIVER = SingletonWebDriver.getWebDriver();

    public static boolean isListElementsContainsString(List<String> list, String expected) {
        return list.stream()
                .allMatch(s -> s.contains(expected));
    }

    public static void scrollToElement(By locator) {
        WebElement element = WEB_DRIVER.findElement(locator);
        ((JavascriptExecutor) WEB_DRIVER).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void sleep(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}