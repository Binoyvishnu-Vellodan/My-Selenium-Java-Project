package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.CsvUtil;

import java.util.Map;

public class Basepage {
    protected WebDriver driver;
    protected Map<String, String> data;

    // Constructor
    public Basepage(WebDriver driver, Map<String, String> data) {
        this.driver = driver;
        this.data = data;
    }

    // Common method to open any URL
    public void openUrl() {
        String url = ConfigReader.getProperty("baseUrl");
        driver.get(url);
    }

    // Reusable sendKeys method
    public void doSendKeys(String pageName, String elementName, String keyValue) {
        By locator = CsvUtil.getBy(pageName, elementName); // fixed variable name
        String value = data.get(keyValue);                 // fetch from Excel data
        driver.findElement(locator).clear();               // optional: clear before sending
        driver.findElement(locator).sendKeys(value);
    }

    // Reusable click method
    public void doClick(By locator) {
        driver.findElement(locator).click();
    }
}
