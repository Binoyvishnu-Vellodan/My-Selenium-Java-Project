package org.CoreJava;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ethihad implements Flyby{
    WebDriver driver;

    @Test(groups = "regression")
    public void Flights() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        fly(driver);
        speak();
        tearDownClass();
    }

    public void fly(WebDriver driver) {
        driver.get("https://www.etihad.com/en-ca/");
        int screenWidth = 1920;  // Adjust if your resolution is different
        int screenHeight = 1080;
        driver.manage().window().setSize(new Dimension(screenWidth / 2, screenHeight));
        driver.manage().window().setPosition(new Point(screenWidth / 2, 0));
        try {
            Thread.sleep(5000); // Waits for 3 seconds (3000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void speak() {
        System.out.println("Speak Arabic");
    }
    public void tearDownClass() {
        if (driver != null) {
            driver.quit();
            System.out.println("Closed AirIndia driver");
        }
    }
}
