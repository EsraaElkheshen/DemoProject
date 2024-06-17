package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P08_DigestAuthentication {
    WebDriver driver;

    public P08_DigestAuthentication(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void openDigestAuthentication() {
        String auth = "admin";
        // appending username, password with URL
        String url = "https://" + auth + ":" + auth + "@" +
                "the-internet.herokuapp.com/digest_auth";
        driver.get(url);
        WebElement succesMessage = driver.findElement(By.xpath("//p[normalize-space()='Congratulations! You must have the proper credentials.']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(succesMessage));
        String message = succesMessage.getText();
        System.out.println("Text is: " + message);
        driver.navigate().refresh();
        driver.navigate().back();

    }

}
