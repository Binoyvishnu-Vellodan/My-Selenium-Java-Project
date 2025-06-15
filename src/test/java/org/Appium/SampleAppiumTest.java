package org.Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


        public class SampleAppiumTest {
            @Test
            public void launchApp() throws MalformedURLException {
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("appium:platformName","Android");
                caps.setCapability("appium:automationName","UiAutomator2");
                caps.setCapability("appium:deviceName","emulator-5554");
                caps.setCapability("platformVersion","16");
                caps.setCapability("browserName","Chrome");
                caps.setCapability("autoGrantPermissions", true);

                AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
                driver.get("https://www.google.com");

                System.out.println("✅ Chrome launched and navigated to Google");

                driver.quit();
            }

}
