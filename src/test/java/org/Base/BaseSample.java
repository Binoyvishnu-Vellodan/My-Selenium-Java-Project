package org.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseSample {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        String baseUrl = "https://www.google.ca";

        // Initialize WebDriver
        driver = new ChromeDriver(); // You can use WebDriverManager if needed
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
