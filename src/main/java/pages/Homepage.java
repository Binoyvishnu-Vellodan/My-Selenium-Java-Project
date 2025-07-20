package pages;

import base.Basepage;
import org.openqa.selenium.WebDriver;
import java.util.Map;

public class Homepage extends Basepage {

    public Homepage(WebDriver driver, Map<String, String> data) {
        super(driver, data);
    }

    public void clickJoinNow() {
        doClick("HomePage", "JoinNow");
        switchToNewWindow();
    }
}
