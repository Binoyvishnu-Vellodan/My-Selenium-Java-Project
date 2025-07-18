package pages;
import base.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Formspage extends Basepage {
    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By submitButton = By.id("submit");

    public Formspage(WebDriver driver) {
        super(driver);
    }

    public void fillForm(String name, String email) {
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
    }

    public void submit() {
        driver.findElement(submitButton).click();
    }
}
