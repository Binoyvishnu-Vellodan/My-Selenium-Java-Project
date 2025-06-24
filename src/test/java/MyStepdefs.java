import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    WebDriver driver=new ChromeDriver();

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("User enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
    }

    @Then("User is redirected to the dashboard")
    public void userIsRedirectedToTheDashboard() {
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        assert currentUrl.contains("logged-in-successfully"); // Example assertion
        DriverFactory.quitDriver();
    }


}
