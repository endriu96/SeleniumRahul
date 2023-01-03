import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class CheckboxChallenge {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPractice\\driver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement checkBoxOne= driver.findElement(By.xpath("//input[contains(@id,\"checkBoxOption1\")]"));

        checkBoxOne.click();
        Assert.assertTrue(checkBoxOne.isSelected());
        checkBoxOne.click();
        Assert.assertFalse(checkBoxOne.isSelected());

        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

}}
