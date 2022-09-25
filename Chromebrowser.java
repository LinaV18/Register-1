package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.Urls;

import java.net.URL;

public class Chromebrowser {
    public static void main(String[] args) {

//         2. Set up the chromebrowser - Path
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\Drivers\\chromedriver.exe");

//        1. Create an instance of webdriver
        WebDriver driver = new ChromeDriver();

//        3. Navigate to Webpage
        driver.get("\"https://demo.nopcommerce.com/\"");
        System.out.println(driver.getTitle());
        String Title = driver.getTitle();
        System.out.println("page Title:" + Title);


    }

}






