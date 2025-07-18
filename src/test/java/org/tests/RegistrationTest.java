package org.tests;

import org.base.BaseTest;
import org.testng.annotations.Test;
import pages.Registrationpage;

public class RegistrationTest extends BaseTest {
    @Test
    public void validLoginTest() {
        Registrationpage registrationpage = new Registrationpage(driver);

        // Navigate to site
        registrationpage.driver.get("https://example.com/login");

        // Login with test data
        registrationpage.login("testuser", "password123");

        // You can add asserts here to verify login success
    }
}
