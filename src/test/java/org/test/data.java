package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class data {
    public static void main(String args[]){
        WebDriver driver= new ChromeDriver();

        driver.get("www.google.ca");
        driver.quit();
    }
}
