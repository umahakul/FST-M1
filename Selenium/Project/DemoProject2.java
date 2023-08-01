package Activities;
// Imports
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DemoProject2 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        // Print the title of the page
        System.out.println("Home page title: " + driver.findElement(By.xpath( "//*[@id='post-16']/header/h1")).getText());



        driver.close();
    }
}
