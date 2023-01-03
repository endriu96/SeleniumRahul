import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.Time;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class StaticDropdown {

    WebDriver driver  = new ChromeDriver();
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPractice\\driver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement staticDropdown  = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        WebElement passengersDropdown = driver.findElement(By.id("https://rahulshettyacademy.com/dropdownsPractise/"));



       // passengersDropdown.click();
        Select  dropdown = new Select(staticDropdown);
        //Kliknieta zostaje opcja zgodnie z indeksem liczac od 0
        dropdown.selectByIndex(0);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        //Kliknieta zostaje opcja AED na podstawie widzianego tekstu
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());



        WebElement passengersDropdownPanel = driver.findElement(By.id("divpaxinfo"));
        WebElement passengersDropdownFirstElementPlus = driver.findElement(By.id("hrefIncAdt"));

        passengersDropdownPanel.click();
        passengersDropdownFirstElementPlus.click();

}


  /*  @BeforeSuite
    public void init(){
        v
    }


    @Test
    public void passengersClicking(){
        WebElement passengersDropdownPanel = driver.findElement(By.id("divpaxinfo"));
        WebElement passengersDropdownFirstElementPlus = driver.findElement(By.id("hrefIncAdt"));

        passengersDropdownPanel.click();
        passengersDropdownFirstElementPlus.click();

}


   */
}
