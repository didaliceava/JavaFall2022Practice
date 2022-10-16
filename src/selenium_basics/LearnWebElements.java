package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LearnWebElements {

    public static void main(String[] args) throws Exception {
        String projectPath = System.getProperty("user.dir");
        String geckoDriverPath = projectPath + File.separator + "drivers" + File.separator + "geckodriver.exe";
        String chromeDriverPath = projectPath + File.separator + "drivers" + File.separator + "chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        System.setProperty("webdriver.gecko.driver", geckoDriverPath);

        ChromeDriver driver = new ChromeDriver();

        String url = "https://amazon.com";

        // desktop-grid-1 --> ID
        // div[@id='desktop-grid-1'] --> Xpath
        driver.get(url);
        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='desktop-grid-1']//div[@class='a-cardui-body']//a"));

        ListIterator<WebElement> iter = elements.listIterator();
        List<String> urls = new ArrayList<>();

        while (iter.hasNext()) {
            urls.add(iter.next().getAttribute("href"));
        }

        ListIterator<String> url_iter = urls.listIterator();

        while (url_iter.hasNext()) {
            driver.navigate().to(url_iter.next());
            Thread.sleep(2000);
        }

        driver.close();
        driver.quit();

    }
}
