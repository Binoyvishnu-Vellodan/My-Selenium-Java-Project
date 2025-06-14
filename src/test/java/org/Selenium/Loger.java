package org.Selenium;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loger {
    static Logger logger= LogManager.getLogger(Loger.class);
    public static void main(String args[]){

        WebDriver driver=new ChromeDriver();
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
        driver.close();
        driver.quit();
        logger.info("browser closed");
    }
}
