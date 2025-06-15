package org.Appium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeTest {
    public static void main(String args[]) throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("appium:platformName","Android");
        caps.setCapability("appium:automationName","UiAutomator2");
        caps.setCapability("appium:deviceName","emulator-5554");
        caps.setCapability("platformVersion","16");
        caps.setCapability("browserName","Chrome");
//        caps.setCapability("chromedriverExecutable", "C:\\Users\\binoy\\IdeaProjects\\Selenium\\My-Selenium-Project\\src\\test\\resources\\chromedriver.exe");
        caps.setCapability("appium:noReset",true);

        try {
            AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),caps);
            driver.get("https://www.google.ca");
            Thread.sleep(3000); // wait for page to load
            try {
                // Accept cookies popup if it appears
                WebElement agree = driver.findElement(By.id("L2AGLb"));
                agree.click();
            } catch (Exception ignored) {}

            WebElement searchBox = driver.findElement(By.name("q"));
            Actions actions=new Actions(driver);
            searchBox.sendKeys("ChatGPT"+ Keys.ENTER);
//            actions.moveToElement(searchBox).click().sendKeys("ChatGPT").perform();
            Thread.sleep(3000); // wait for page to load
            driver.quit();
        }
        catch (MalformedURLException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
