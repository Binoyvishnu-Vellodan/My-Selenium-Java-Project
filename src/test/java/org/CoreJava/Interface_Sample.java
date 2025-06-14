package org.CoreJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

interface Flyby{
    void fly(WebDriver driver);
}

public class Interface_Sample {
    @Test
    public void Flights() {
        WebDriver driver = new ChromeDriver();
        Flyby flight1 = new Ethihad();
        Flyby flight2 = new AirIndia();
        flight1.fly(driver);
        flight2.fly(driver);
        driver.quit();
    }
}
class Ethihad implements Flyby{
    public void fly(WebDriver driver) {
        driver.get("https://www.etihad.com/en-ca/");
    }
}
class AirIndia implements Flyby{
    public void fly(WebDriver driver) {
        driver.get("https://www.airindia.com/in/en.html");
    }
}