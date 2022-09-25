package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbrowser {
    public static void main(String[] args) {

        //2. set up Firefoxbrowser -path

        System.setProperty("webdriver.gecko.driver","C:\\Software\\Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com/");

    }
}
