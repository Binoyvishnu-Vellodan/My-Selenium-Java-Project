package org.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
    public static void main(String args[]){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
