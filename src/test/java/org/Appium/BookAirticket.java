package org.Appium;

import org.openqa.selenium.remote.DesiredCapabilities;

public class BookAirticket {
    public static void main(String args[]){
        DesiredCapabilities Cap=new DesiredCapabilities();
        Cap.setCapability("appium:platformName","andriod");
        Cap.setCapability("appium:platformVersion","16");
        Cap.setCapability("UDID","");
    }
}
