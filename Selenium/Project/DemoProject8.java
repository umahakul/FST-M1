package Activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DemoProject8 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("root");
        driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
        Assert.assertEquals("Dashboard ‹ Alchemy Jobs — WordPress",driver.getTitle());
        driver.close();

        }
    }

