package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P03_BasicAuth {
    WebDriver driver;

    public P03_BasicAuth(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public void openBasicAuthPages() throws InterruptedException {
        String auth = "admin";
        // appending username, password with URL
        String url = "https://" + auth + ":" + auth + "@" +
                "the-internet.herokuapp.com/basic_auth";
        driver.get(url);
        WebElement succesMessage = driver.findElement(By.xpath("//p[normalize-space()='Congratulations! You must have the proper credentials.']"));
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(succesMessage));
        String message = succesMessage.getText();
        System.out.println("Text is: " + message);
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(1000);


    }

}
