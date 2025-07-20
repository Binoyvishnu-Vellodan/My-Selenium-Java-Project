package pages;

import base.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CsvUtil;

import java.util.Map;

public class Registrationpage extends Basepage {
    public WebDriver driver;

    public Registrationpage(WebDriver driver, Map<String, String> data) {
        super(driver, data);  // Call to Basepage constructor
    }

    // Actions

    public void gotoRegistration() {
        waitForElement("RegistrationPage", "GoToRegistration", 10);
        doClick("RegistrationPage","GoToRegistration");
    }

    public void enterUserDetails() {
        doSendKeys("RegistrationPage", "FirstName", "FirstName");
        doSendKeys("RegistrationPage", "LastName", "LastName");
        doSendKeys("RegistrationPage", "Email", "Email");
        doSendKeys("RegistrationPage", "Mobile", "Mobile");
        doDropdownSelection("RegistrationPage", "Country", "Country");
        doSendKeys("RegistrationPage", "City", "City");
        doSendKeys("RegistrationPage", "Message", "Message");
    }
}
