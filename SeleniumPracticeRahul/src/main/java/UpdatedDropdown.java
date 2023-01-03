import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class UpdatedDropdown {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPractice\\driver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement passengersDropdownPanel = driver.findElement(By.id("divpaxinfo"));
        WebElement passengersDropdownFirstElementPlus = driver.findElement(By.id("hrefIncAdt"));
        WebElement passengersDropdownDoneButton = driver.findElement(By.id("btnclosepaxoption"));

        passengersDropdownPanel.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        int i=1;
        while(i <5){
        passengersDropdownFirstElementPlus.click();
        i++;
        }
        passengersDropdownDoneButton.click();
      Assert.assertEquals(passengersDropdownPanel.getText(), "5 Adult");

    }

}
