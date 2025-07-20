package Pages;

import basePage.Basepage;
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
