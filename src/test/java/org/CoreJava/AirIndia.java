package org.CoreJava;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AirIndia implements Flyby{
    @Test(groups = "regression")
    public void Flights() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        fly(driver);
        speak();
    }
    @Test(description = "Open Google and verify title")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Google Search")
    @Owner("Binoy Vishnu")
    public void fly(WebDriver driver) {
        driver.get("https://www.airindia.com/in/en.html");
        assert driver.getTitle().contains("Air India");
        driver.manage().window().setPosition(new Point(0, 0));
        driver.manage().window().setSize(new Dimension(960, 1080));
        driver.close();
    }

    public void speak() {
        System.out.println("Speak Hindi");
    }
}