package org.tests;


import org.Dataprovider.ExcelDataProvider;
import org.Base.BaseTest;
import org.testng.annotations.Test;
import Pages.Homepage;
import Pages.Registrationpage;

import java.util.Map;

public class RegistrationTest extends BaseTest {
    @Test(groups = "regression",dataProvider = "excelData", dataProviderClass = ExcelDataProvider.class)
    public void testRegistration(Map<String, String> data) {
        Homepage home = new Homepage(driver, data);
        home.openUrl();
        home.clickJoinNow(); // Open and switch to new window

        Registrationpage reg = new Registrationpage(driver, data);
        reg.gotoRegistration();
        reg.enterUserDetails();
    }
}
