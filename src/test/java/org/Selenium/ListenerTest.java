package org.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenshotListener.class)

public class ListenerTest{
    WebDriver driver;

    @Test
    public void failtest(){
        driver=new ChromeDriver();
        ScreenshotListener.driver=driver;

        driver.get("https://google.ca");
        assert driver.getTitle().equals("Wrong title");
        driver.quit();
    }
}
