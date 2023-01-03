import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DynamicDropdown {



    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPractice\\driver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");



        WebElement dynamicDropdown  = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"));

        dynamicDropdown.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement chennaiItem = driver.findElement(new By.ByXPath("//a[contains(@value,'MAA')]"));
       chennaiItem.click();

    }

}