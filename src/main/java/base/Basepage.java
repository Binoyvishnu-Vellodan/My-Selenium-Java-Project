package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import utils.ConfigReader;
import utils.CsvUtil;
import utils.ExcelUtils;

import java.time.Duration;
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
    public void switchToNewWindow() {
        String currentWindow = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(currentWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }
    public void waitForElement(String pageName, String elementName, int timeoutSeconds) {
        By locator = CsvUtil.getBy(pageName, elementName);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Reusable click method
    public void doClick(String pageName, String elementName) {
        By locator = CsvUtil.getBy(pageName, elementName); // fixed variable name
        driver.findElement(locator).click();
    }

    // Reusable sendKeys method
    public void doSendKeys(String pageName, String elementName, String keyValue) {
        By locator = CsvUtil.getBy(pageName, elementName); // fixed variable name
        String value = data.get(keyValue);                 // fetch from Excel data
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(locator));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.clear();
        element.sendKeys(value);
    }

    // Reusable Dropdown Selection method
    public void doDropdownSelection(String pageName, String elementName, String keyValue){
        By locator = CsvUtil.getBy(pageName, elementName); // fixed variable name
        String value = data.get(keyValue);                 // fetch from Excel data
        WebElement Dropdown=driver.findElement(locator);
        Select select=new Select(Dropdown);
        select.selectByVisibleText(value);
    }
}
