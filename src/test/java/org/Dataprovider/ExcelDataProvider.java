package org.Dataprovider;

import org.testng.annotations.DataProvider;
import utils.ExcelUtils;

public class ExcelDataProvider {
    @DataProvider(name = "excelData")
    public Object[][] getExcelData() {
        String path = System.getProperty("user.dir") + "/src/test/resources/testdata/data.xlsx";
        ExcelUtils reader = new ExcelUtils(path);
        return reader.getAllTestDataAsMap();
    }
}
