package org.CoreJava;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AirIndia implements Flyby{
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
        driver.get("https://www.airindia.com/in/en.html");
        assert driver.getTitle().contains("Air India");
        int screenWidth = 1920;  // Adjust if your resolution is different
        int screenHeight = 1080;
        driver.manage().window().setSize(new Dimension(screenWidth / 2, screenHeight));
        driver.manage().window().setPosition(new Point(0, 0));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(By.id()))
        try {
            Thread.sleep(5000); // Waits for 3 seconds (3000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void speak() {
        System.out.println("Speak Hindi");
    }
    public void tearDownClass() {
        if (driver != null) {
            driver.quit();
            System.out.println("Closed AirIndia driver");
        }
    }
}