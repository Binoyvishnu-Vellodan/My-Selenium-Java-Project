package utils;

import org.openqa.selenium.By;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class CsvUtil {

    // Use absolute path based on your project structure
    private static final String LOCATOR_PATH = System.getProperty("user.dir") + "/src/test/resources/testdata/locators.csv";
    private static Map<String, String[]> locatorMap = new HashMap<>();

    static {
        try (BufferedReader br = new BufferedReader(new FileReader(LOCATOR_PATH))) {
            String line;
            br.readLine(); // Skip header line

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;  // skip empty lines

                String[] parts = line.split(",", 4);  // split into max 4 parts (to handle commas in XPath)
                if (parts.length < 4) {
                    System.err.println("Invalid line format (skipped): " + line);
                    continue;
                }

                String key = parts[0].trim() + "." + parts[1].trim();
                String locatorType = parts[2].trim();
                String locatorValue = parts[3].trim();

                locatorMap.put(key, new String[]{locatorType, locatorValue});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Returns Selenium By object for the given page and element name
    public static By getBy(String page, String elementName) {
        String key = page + "." + elementName;
        String[] locatorParts = locatorMap.get(key);

        if (locatorParts == null) {
            throw new RuntimeException("Locator not found for: " + key);
        }

        String locatorType = locatorParts[0].toLowerCase();
        String locatorValue = locatorParts[1];

        switch (locatorType) {
            case "id":
                return By.id(locatorValue);
            case "name":
                return By.name(locatorValue);
            case "xpath":
                return By.xpath(locatorValue);
            case "css":
            case "cssselector":
                return By.cssSelector(locatorValue);
            case "classname":
                return By.className(locatorValue);
            case "tagname":
                return By.tagName(locatorValue);
            case "linktext":
                return By.linkText(locatorValue);
            case "partiallinktext":
                return By.partialLinkText(locatorValue);
            default:
                throw new IllegalArgumentException("Invalid locator type: " + locatorType);
        }
    }
}
