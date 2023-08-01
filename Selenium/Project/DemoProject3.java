package Activities;
// Imports
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
public class DemoProject3 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        // Print the title of the page
       // System.out.println("Home page title: " + driver.findElement(By.xpath( "//*[@id='post-16']/header/h1")).getText());


        WebElement l=driver.findElement(By.xpath( "//*[@id='post-16']/header/div/img"));
        System.out.println("Src attribute is: "+ l.getAttribute("src"));
        System.out.println("About Url: " + driver.getCurrentUrl());


        driver.close();
}}
