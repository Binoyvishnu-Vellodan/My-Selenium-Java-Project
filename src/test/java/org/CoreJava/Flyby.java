package org.CoreJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface Flyby {
    void fly(WebDriver driver);
    void speak();
    void tearDownClass();
}
