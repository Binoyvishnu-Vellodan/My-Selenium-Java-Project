package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CsvUtil;

public class Loginpage {
    WebDriver driver;

    public void LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators from CSV
    By usernameField = CsvUtil.getBy("LoginPage", "Username");
    By passwordField = CsvUtil.getBy("LoginPage", "Password");
    By loginButton = CsvUtil.getBy("LoginPage", "LoginButton");

    // Actions
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void login(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }

}
