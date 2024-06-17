package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P16_ExitIntent {
    WebDriver driver;

    public P16_ExitIntent(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(tagName = "body")
    WebElement body;

    @FindBy(className = "modal")
    WebElement modal;

    public void openExitIntent() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(body, 0, 0).perform();
        Thread.sleep(2000);
        System.out.println("Modal is displayed: " + modal.isDisplayed());
        // For demonstration, you can close the modal
        WebElement closeButton = driver.findElement(By.xpath("//p[normalize-space()='Close']"));
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        //closeButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", closeButton);// Replace 'popupId' with the actual ID of the popup or element

        driver.navigate().back();
    }

}
