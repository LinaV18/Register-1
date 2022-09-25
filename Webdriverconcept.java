package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverconcept {
    public static void main(String[] args) {
        System.setProperty("Webdriver.Chrome.driver","C:/Software/Drivre/ ChromDrivers.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        WebDriverManager.chromedriver().setup();
        WebDriver Driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("htt//demo.nopcommerce.com/");




    }

    }




