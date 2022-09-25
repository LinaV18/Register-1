package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expicitwait {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        WebDriverWait wait=new WebDriverWait(driver,20);//timeout
        wait.until(ExpectedConditions.titleContains("nopcommerce"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("html-login-page")));
        System.out.println(driver.getTitle());
    }
}
