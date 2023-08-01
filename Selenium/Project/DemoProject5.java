package Activities;
// Imports
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class DemoProject5 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        List<WebElement> elements=driver.findElements(By.xpath("//*[@id='primary-menu']"));
        for (WebElement element : elements) {
            System.out.println("Navigation bar details:" + element.getText());
        }
        // Print the title of the page
        driver.findElement(By.xpath( "//*[@id='menu-item-24']/a")).click();
        Assert.assertEquals("Jobs – Alchemy Jobs",driver.getTitle());
        //System.out.println(driver.getTitle());

        driver.close();
    }}

