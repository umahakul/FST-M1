package Activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;
import java.util.List;

public class DemoProject9 {


    private static Instant wait;

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("root");
        driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id='adminmenu']"));
        for (WebElement element : elements) {
            System.out.println("Menu Details:" + element.getText());
        driver.findElement(By.xpath("//*[@id='menu-posts-job_listing']/a/div[3]")).click();
        driver.findElement(By.xpath("//*[@id='wpbody-content']/div[4]/a")).click();
        WebElement closePopup = driver.findElement(By.xpath("//button[@class='components-button has-icon' and @aria-label='Close dialog']"));
            if(closePopup.isDisplayed() && closePopup.isEnabled()){
                closePopup.click();
            }
        driver.findElement(By.xpath("//*[@id='post-title-0']")).sendKeys("Data Analyst");
        driver.findElement(By.xpath("//*[@id='editor']/div/div/div[1]/div/div[1]/div/div[2]/button[2]")).click();
        driver.findElement(By.xpath("//*[@id='editor']/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div/button")).click();
       // driver.findElement(By.xpath("//*[@id='editor']/div/div/div[1]/div/div[2]/div[1]/div[3]/div/div/div/div/a")).click();


          // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='editor-post-publish-panel__header-published' and text()='Published']")));
//Go to home page
            driver.findElement(By.xpath("//a[@class='components-button edit-post-fullscreen-mode-close has-icon']")).click();
//click Joblisting
            driver.findElement(By.xpath("//div[@class='wp-menu-name' and text()='Job Listings']")).click();
//Assert the job posted
            Assert.assertEquals(driver.findElement(By.xpath("//div[@class='job_position']/a[1]")).getText(),"Data Analyst" );






        driver.quit();
}}}
