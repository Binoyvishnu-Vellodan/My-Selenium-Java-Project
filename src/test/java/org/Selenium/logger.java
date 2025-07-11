package org.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class logger {
    Logger logger= LogManager.getLogger(logger.class);
    WebDriver driver = new ChromeDriver();

    @Test(groups = "regression")
    public void LogTest() throws Exception {
        try {
            driver.get("https://www.google.ca");
            logger.info("browser is opened with google url");
            boolean login=false;
            if(login!=true){
                throw  new Exception("Login Failed");
            }
            else{
                logger.info("Login Success");
            }
        }
        catch (Exception e){
            logger.error("Exception occurred: "+e.getMessage(),e);
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
