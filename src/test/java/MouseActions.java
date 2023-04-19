import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions {
    @Test
    public void MA(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        Actions task= new Actions(driver);
//        WebElement a = driver.findElement(By.id("doubleClickBtn"));
//        task.doubleClick(a).perform();
//        WebElement b = driver.findElement(By.id("rightClickBtn"));
//        task.contextClick(b).perform();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")).click();


    }
}
