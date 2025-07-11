package org.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Loger{
    static Logger logger= LogManager.getLogger(Loger.class);
    WebDriver driver = new ChromeDriver();

    @Test(groups = "regression")
    public void NewTest(){
        driver.manage().window().maximize();
        driver.get("https://www.google.ca");
        logger.info("Google website is open now");
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

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("✅ Closed driver.");
        }
    }
}
