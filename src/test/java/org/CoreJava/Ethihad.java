package org.CoreJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ethihad implements Flyby{
    @Test
    public void Flights() {
        WebDriver driver = new ChromeDriver();
        fly(driver);
        speak();
    }

    public void fly(WebDriver driver) {
        driver.get("https://www.etihad.com/en-ca/");
        driver.manage().window().maximize();
    }

    public void speak() {
        System.out.println("Speak Arabic");
    }
}
