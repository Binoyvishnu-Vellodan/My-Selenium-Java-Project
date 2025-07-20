package org.tests;

import org.Dataprovider.ExcelDataProvider;
import org.Base.BaseTest;
import org.testng.annotations.Test;
import Pages.Elementspage;

import java.util.Map;

public class ElementsTest extends BaseTest {
    @Test(groups = "regression",dataProvider = "excelData", dataProviderClass = ExcelDataProvider.class)
    public void testElements(Map<String, String> data) {
        Elementspage element = new Elementspage(driver, data);
        element.openUrl();
        element.clickElementsLink();
    }
}
