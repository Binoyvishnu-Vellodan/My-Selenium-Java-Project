package org.Appium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeTest {
    public static void main(String args[]) throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("appium:automationName","UiAutomator2");
        caps.setCapability("deviceName","emulator-5554");
        caps.setCapability("platformVersion","16");
        caps.setCapability("browserName","Chrome");
        caps.setCapability("appium:noReset",true);

        try {
            AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
            driver.get("https://www.google.ca");
            Thread.sleep(3000); // wait for page to load
            try {
                // Accept cookies popup if it appears
                WebElement agree = driver.findElement(By.id("L2AGLb"));
                agree.click();
            } catch (Exception ignored) {}

            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("ChatGPT");
            searchBox.submit();
            Thread.sleep(3000); // wait for page to load
            driver.quit();
        }
        catch (MalformedURLException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
