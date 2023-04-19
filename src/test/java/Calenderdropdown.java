import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Calenderdropdown {
    @Test
    public void Calender(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.findElement(By.id("dateOfBirthInput")).click();
        WebElement a = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        Select s1= new Select(a);
        s1.selectByIndex(9);
        WebElement b = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select s2 = new Select(b);
        s2.selectByValue("1980");
        driver.findElement(By.xpath("//div[@aria-label='Choose Monday, October 27th, 1980']")).click();


    }
}
