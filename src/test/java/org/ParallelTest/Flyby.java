package org.ParallelTest;

import org.openqa.selenium.WebDriver;

public interface Flyby {
    void fly(WebDriver driver);
    void speak();
    void tearDownClass();
}
