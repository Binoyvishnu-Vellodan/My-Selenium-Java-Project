package org.Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Screenshot {
    public static void main(String args[]) throws IOException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.ca/");
        driver.manage().window().maximize();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='APjFqb']")));

        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:/Users/binoy/IdeaProjects/Selenium/src/Files/Screenshot/screenshot.png"));
        driver.close();
        driver.quit();
    }
}
