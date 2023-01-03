import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoSuggestiveDropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPractice\\driver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("Po");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        List<WebElement> options= driver.findElements(By.xpath("//li[contains(@class,'ui-menu-item')]"));

        for(WebElement option: options){
            if(option.getText().equalsIgnoreCase("Poland")){
                option.click();
                break;
            }

        }
       //Assert.assertEquals(driver.findElement(By.id("autosuggest")).getText(), "Poland");


    }}
