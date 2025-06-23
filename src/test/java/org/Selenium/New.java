package org.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New {
    @Test(groups = "regression")
    public void Data(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();
        driver.close();
    }
}
