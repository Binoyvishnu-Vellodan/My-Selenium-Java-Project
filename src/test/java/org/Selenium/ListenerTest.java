package org.Selenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ListenerTest {
    WebDriver driver = new ChromeDriver();

//    @Test(groups = "regression")
//    public void failtest(){
//        driver.get("https://google.ca");
//        assert driver.getTitle().equals("Yahoo");
//    }
    @Test(groups = "regression")
    public void passtest() {
        driver.get("https://google.ca");
        assert driver.getTitle().equals("Google");
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("✅ Closed driver.");
        }
    }
}
