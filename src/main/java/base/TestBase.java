package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    public static WebDriver driver;

    public static void initialization(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.selenium-shop.pl/");
    }
}
