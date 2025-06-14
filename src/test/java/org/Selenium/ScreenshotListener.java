package org.Selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

public class ScreenshotListener implements ITestListener {
    public static WebDriver driver;

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("❌ Test failed: " + result.getName());
        if (driver != null) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File srcFile = ts.getScreenshotAs(OutputType.FILE);

            String timestamp = String.valueOf(new Date().getTime());
            String screenshotPath = "screenshots/" + result.getName() + "_" + timestamp + ".png";

            try {
                Files.createDirectories(Paths.get("screenshots"));
                Files.copy(srcFile.toPath(), Paths.get(screenshotPath));
                System.out.println("📸 Screenshot saved at: " + screenshotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
