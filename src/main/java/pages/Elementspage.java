package pages;

import base.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elementspage extends Basepage {
    private By formsLink = By.xpath("//a[text()='Forms']");

    public Elementspage(WebDriver driver) {
        super(driver);
    }

    public void clickFormsLink() {
        driver.findElement(formsLink).click();
    }
}
