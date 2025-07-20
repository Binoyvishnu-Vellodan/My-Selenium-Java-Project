package org.Selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.Base.BaseSamples;
import org.testng.annotations.Test;

public class logger extends BaseSamples {
    Logger logger= LogManager.getLogger(logger.class);

    @Test(groups = "regression")
    public void LogTest() throws Exception {
        try {
            setUp();
            driver.get("https://www.google.ca");
            logger.info("browser is opened with google url");
            boolean login=false;
            tearDown();
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
}
