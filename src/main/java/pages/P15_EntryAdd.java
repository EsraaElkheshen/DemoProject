package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P15_EntryAdd {
    WebDriver driver;

    public P15_EntryAdd(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[normalize-space()='click here']")
      WebElement link;


    public void openAddEntry() throws InterruptedException {
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(link).build().perform();
        Thread.sleep(2000);
        WebElement closeButton = driver.findElement(By.xpath("//p[normalize-space()='Close']"));
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        //closeButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", closeButton);
        driver.navigate().back();
    }

}
