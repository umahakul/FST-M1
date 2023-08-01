package Activities;
// Imports
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
public class DemoProject7 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        driver.manage().window().maximize();
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id='primary-menu']"));
        for (WebElement element : elements) {
            System.out.println("Navigation bar details:" + element.getText());
            driver.findElement(By.xpath("//*[@id='menu-item-26']")).click();

           /* WebElement S = (WebElement) driver.findElement(By.xpath("//*[@id='create_account_email']"));
            new Actions(driver).moveToElement(S).click().perform();
            S.sendKeys("abc@gmail.com");
            Thread.sleep(8000);
           WebElement T = (WebElement) driver.findElement(By.xpath("//*[@id='job_title']"));
            new Actions(driver).moveToElement(T).click().perform();
            T.sendKeys("consultant");*/

            driver.switchTo().frame("job_description_ifr");

            driver.findElement(By.xpath("//*[@id='job_description_ifr']")).sendKeys("hi");
            driver.findElement(By.xpath("//*[@id='wp-job_description-editor-container']")).sendKeys("urgent need for job");


            WebElement A = (WebElement) driver.findElement(By.xpath("//*[@id='job_description_ifr']"));
            new Actions(driver).moveToElement(A).click().perform();
            A.sendKeys("India");
            WebElement B = (WebElement) driver.findElement(By.xpath("//*[@id='application']l"));
            new Actions(driver).moveToElement(B).click().perform();
            B.sendKeys("ibm@gmail.com");

            WebElement L = driver.findElement(By.xpath("//*[@id='company_name']"));
            new Actions(driver).moveToElement(L).click().perform();
            L.sendKeys("IBM");
             driver.findElement(By.xpath("//*[@id='submit-job-form']/p/input[4]")).click();

            driver.quit();
        }
    }}
