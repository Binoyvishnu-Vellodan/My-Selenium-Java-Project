package org.Selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.Base.BaseSamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Loger extends BaseSamples {
    static Logger logger= LogManager.getLogger(Loger.class);

    @Test(groups = "regression")
    public void NewTest() throws InterruptedException {
        setUp();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("APjFqb")));
        searchBox.sendKeys("Java");
        Thread.sleep(Long.parseLong("3000"));
        logger.info("Google website is open now");
        tearDown();
        try {
            int a = 5;
            int b = a / 0;
        }
        catch(Exception e){
            logger.error("Arithmatic Exception",e);
        }
        boolean login=true;
        if(!login){
            try {
                throw  new Exception("Log in failure");
            }
            catch (Exception e){
                logger.error("Log in failed",e);
            }
        }
    }
}
