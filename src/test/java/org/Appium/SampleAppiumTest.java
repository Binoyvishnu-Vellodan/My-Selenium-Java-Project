package org.Appium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


        public class SampleAppiumTest {
            public void launchApp() throws MalformedURLException {
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("appium:platformName","Android");
                caps.setCapability("appium:automationName","UiAutomator2");
                caps.setCapability("appium:deviceName","emulator-5554");
                caps.setCapability("platformVersion","16");
                caps.setCapability("browserName","Chrome");
                caps.setCapability("autoGrantPermissions", true);

                AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
                driver.navigate().to("https://www.kia.ca/en");
                WebElement SelectProvince=driver.findElement(By.xpath("//select[@name='lang-modal-province']"));
                SelectProvince.click();
                WebElement Ontario=driver.findElement(By.xpath("//option[@value='ON']"));
                Ontario.click();
                WebElement Update=driver.findElement(By.xpath("//button[text()='Update']"));
                Update.click();
                driver.quit();
            }

}
