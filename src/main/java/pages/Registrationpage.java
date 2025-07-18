package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CsvUtil;

public class Registrationpage {
    public WebDriver driver;

    public void Registrationpage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators from CSV
    By usernameField = CsvUtil.getBy("LoginPage", "Username");
    By passwordField = CsvUtil.getBy("LoginPage", "Password");
    By loginButton = CsvUtil.getBy("LoginPage", "LoginButton");

    // Actions

    public void gotoRegistration() {
        driver.findElement(loginButton).click();
    }

    public void enterFirstname(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterLastname(String Lastname) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterEmail(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void enterMobile(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void login(String user, String pass) {
        gotoRegistration();
        enterFirstname(pass);
        enterLastname(name);
        clickLogin();
    }

}
