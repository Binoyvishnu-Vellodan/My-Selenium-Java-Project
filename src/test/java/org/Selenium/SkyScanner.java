package org.Selenium;

import org.Dataprovider.ExcelDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.CsvUtil;

import java.util.Map;

public class SkyScanner {
    @Test(dataProvider = "excelData", dataProviderClass = ExcelDataProvider.class)
    public void loginTest(Map<String, String> data) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.skyscanner.ca/");
        By type = CsvUtil.getBy("SearchPage", "Type");
        driver.findElement(type).click();
        Thread.sleep(Long.parseLong("4000"));

        By From = CsvUtil.getBy("SearchPage", "From");
        driver.findElement(type).sendKeys(data.get("From"));

        driver.quit();

    }
}
