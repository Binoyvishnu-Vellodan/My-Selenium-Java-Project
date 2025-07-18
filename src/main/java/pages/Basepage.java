package pages;

import org.openqa.selenium.WebDriver;
import utils.ConfigReader;

public class Basepage {
    protected WebDriver driver;

    // Constructor
    public Basepage(WebDriver driver) {
        this.driver = driver;
    }

    // Common method to open any URL
    public void openUrl() {
        String url = ConfigReader.getProperty("baseUrl");
        driver.get(url);
    }
}
