


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
    @Test
    public void DropDown(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        Select s =new Select(driver.findElement(By.id("oldSelectMenu")));
        s.selectByVisibleText("Black");
        
        //s.selectByIndex(7);
        //s.selectByValue("3");



    }
}
