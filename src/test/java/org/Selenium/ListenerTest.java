package org.Selenium;
import org.Base.BaseSamples;
import org.testng.annotations.Test;



public class ListenerTest extends BaseSamples {

    @Test(groups = "regression")
    public void passTest() {
        setUp();
        driver.get("https://www.google.com");
        assert driver.getTitle().equals("Google");
        tearDown();
    }
}
