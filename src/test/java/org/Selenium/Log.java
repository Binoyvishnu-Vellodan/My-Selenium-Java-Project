package org.Selenium;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.LoggerFactory;

public class Log{
    static Logger logger= LogManager.getLogger(Log.class);
    public static void main(String args[]){
        logger.info("Starting the test");

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.ca/");
        logger.info("Chrome browser loaded Google");

        try {
            throw  new Exception("Login failure");
        }catch (Exception e){
            logger.info("login failed"+e);
        }finally {
            driver.quit();
            logger.info("Browser closed");
        }
    }
}
