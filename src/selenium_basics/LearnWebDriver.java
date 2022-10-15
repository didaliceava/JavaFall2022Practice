package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class LearnWebDriver {

    public static void main(String[] args) throws Exception {
        String projectPath = System.getProperty("user.dir");
        String geckoDriverPath = projectPath + File.separator + "drivers" + File.separator + "geckodriver.exe";
        String chromeDriverPath = projectPath + File.separator + "drivers" + File.separator + "chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        System.setProperty("webdriver.gecko.driver", geckoDriverPath);

        FirefoxDriver geckoDriver = new FirefoxDriver();

        // Multiple ways to navigate to a URL
//        chromeDriver.navigate().to("https://amazon.com");
        geckoDriver.get("https://amazon.com");
        geckoDriver.manage().window().maximize();
        geckoDriver.manage().deleteAllCookies();

        /*
        1 - Launch Browser
        2 - Navigate to https://amazon.com
        3 - Locate Search Bar element
        4 - Type "Comfy Chair" in search bar
        5 - Click Search button
         */

        WebElement searchBar = geckoDriver.findElement(By.id("twotabsearchtextbox"));
        searchBar.sendKeys("Comfy Chair");

        WebElement searchButton = geckoDriver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        Thread.sleep(5000);

        geckoDriver.close();
        geckoDriver.quit();
    }

}
