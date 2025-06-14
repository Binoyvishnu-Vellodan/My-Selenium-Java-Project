package org.Selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logger {
    public static void main(String args[]) throws Exception {
        Logger logger= LogManager.getLogger(logger.class);
        WebDriver driver=new ChromeDriver();
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
        finally {
            driver.quit();
            driver.close();
        }
    }
}
