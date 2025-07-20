package pages;

import base.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class Elementspage extends Basepage {

    public Elementspage(WebDriver driver, Map<String, String> data) {
        super(driver, data);
    }

    public void clickElementsLink() {
        doClick("ElementsPage", "Elements");
    }
}
