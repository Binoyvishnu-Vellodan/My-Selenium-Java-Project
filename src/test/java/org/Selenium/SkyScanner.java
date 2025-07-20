package org.Selenium;

import org.Dataprovider.ExcelDataProvider;
import org.Base.BaseSamples;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.CsvUtil;

import java.util.Map;

public class SkyScanner extends BaseSamples {
    @Test(groups = "regression",dataProvider = "excelData", dataProviderClass = ExcelDataProvider.class)
    public void loginTest(Map<String, String> data) throws InterruptedException {
        setUp();
        driver.get("https://www.skyscanner.ca/");
        By type = CsvUtil.getBy("SearchPage", "Type");
        driver.findElement(type).click();
        Thread.sleep(Long.parseLong("4000"));

        By From = CsvUtil.getBy("SearchPage", "From");
        driver.findElement(type).sendKeys(data.get("From"));
        tearDown();
    }
}
