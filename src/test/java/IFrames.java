import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrames {
    @Test
    public void frame(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        WebElement a = driver.findElement(By.id("frame1"));
        WebElement b = driver.findElement(By.id("frame2"));
        driver.switchTo().frame(1);
        System.out.println(driver.getPageSource());
        driver.switchTo().defaultContent();
        System.out.println(driver.getPageSource());

    }
}
