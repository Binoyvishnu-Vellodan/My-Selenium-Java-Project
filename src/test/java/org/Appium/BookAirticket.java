package org.Appium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BookAirticket {
    public static void main(String args[]) throws MalformedURLException {
        DesiredCapabilities Cap=new DesiredCapabilities();
        Cap.setCapability("appium:platformName","andriod");
        Cap.setCapability("appium:automationName","UiAutomator2");
        Cap.setCapability("appium:deviceName","emulator-5554");
        Cap.setCapability("platformVersion","16");
        Cap.setCapability("browserName","Chrome");
        Cap.setCapability("noRest",true);

        AndroidDriver driver=new AndroidDriver(new URL("https://localhost:4723"),Cap);


    }
}
