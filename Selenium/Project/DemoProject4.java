package Activities;
// Imports
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DemoProject4 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        // Print the title of the page
        System.out.println("Second heading of the page: " + driver.findElement(By.xpath( "//*[@id='post-16']/div/h2")).getText());


        Assert.assertEquals("Quia quis non",driver.findElement(By.xpath( "//*[@id='post-16']/div/h2")).getText());
        driver.close();
    }}


