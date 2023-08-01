package Activities;
// Imports
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
public class DemoProject6 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        driver.findElement(By.xpath( "//*[@id='menu-item-24']/a")).click();
        driver.findElement(By.xpath("//*[@id='search_keywords']")).sendKeys("Banking");
        driver.findElement(By.xpath( "//*[@id='post-7']")).click();

        driver.findElement(By.xpath("//*[@id='post-7']/div/div/ul/li[1]/a/div[1]/h3")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='post-5867']/div/div/div/div[3]/input")).click();
        WebElement email=driver.findElement(By.xpath("//*[@id='post-5867']/div/div/div/div[3]/div/p/a"));
        System.out.println("JOb details needs to be send in the email:" + email.getText());















        driver.close();
    }
}
