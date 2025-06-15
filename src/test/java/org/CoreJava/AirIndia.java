package org.CoreJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AirIndia implements Flyby{
    @Test
    public void Flights() {
        WebDriver driver = new ChromeDriver();
        fly(driver);
        speak();
    }

    public void fly(WebDriver driver) {
        driver.get("https://www.airindia.com/in/en.html");
        driver.manage().window().maximize();
    }

    public void speak() {
        System.out.println("Speak Hindi");
    }
}
