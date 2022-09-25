package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;
import java.util.Objects;

public class WEbDriverBasic {
    private static String Url;

    public static void main(String[] args) throws InterruptedException   {
        System.setProperty("Webdriver.chrome.diver", "C:/Software/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        System.out.println(driver.getTitle());
        String Title = driver.getTitle();
        System.out.println("Page Title:" + Title);
        if (Objects.equals(Title, "https://demo.nopcommerce.com/")) {
            System.out.println("page Title is correct");
        } else {
            System.out.println("page Title is incorrect");
        }
        if (Title == "nopCommerce demo store1") {
            System.out.println("page Title is correct");
        } else {
            System.out.println("page Title is incorrect");
        }
        driver.findElement(By.className("ico-log")).click();
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        driver.manage().window().maximize();
        driver.navigate().refresh();
        System.out.println("Current Url:"+Url);
        driver.quit();
        driver.close();




    }


    }
