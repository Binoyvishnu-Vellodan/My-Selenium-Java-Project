package org.Appium;

import org.openqa.selenium.remote.RemoteWebElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

public class ActionsAPI {
    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("appium:platformName","Android");
        caps.setCapability("appium:automationName","UiAutomator2");
        caps.setCapability("appium:deviceName","Emulator-5554");
        caps.setCapability("appium:platformVersion","16");
        caps.setCapability("appium:appPackage","com.google.android.apps.photos");
        caps.setCapability("appium:appActivity","com.google.android.apps.photos.home.HomeActivity");
        caps.setCapability("appWaitActivity", "com.google.android.apps.photos.home.HomeActivity");
        caps.setCapability("appium:noReset",true);
        caps.setCapability("autoGrantPermissions", true);

        AndroidDriver driver=new AndroidDriver(new URL("http://localhost:4723"),caps);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement photo=driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(photo));
        photo.click();
        Actions actions=new Actions(driver);
        Thread.sleep(3000);

        // Zoom in gesture (pinch out) - adjust coordinates as needed
        int centerX = 500;
        int centerY = 800;

        // Perform pinchOpen (zoom in) gesture
        HashMap<String, Object> params = new HashMap<>();
        params.put("direction", "in"); // Zoom in
        params.put("elementId", photo.getSize());

        driver.executeScript("mobile: pinchOpen", params);

        Thread.sleep(3000);
        driver.quit();
    }
}
