package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P12_DynamicContent {
    WebDriver driver;

    public P12_DynamicContent(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(linkText = "click here")
    WebElement link;

    @FindBy(tagName = "body")
    WebElement element;

    public void printDynamicContent() {

       // driver.get("https://the-internet.herokuapp.com/dynamic_content?with_content=static");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(link));
        link.click();
        // Example actions with the static content
        System.out.println("Static content: " + element.getText());
        // Close the browser
        driver.navigate().back();
        driver.navigate().back();
    }


    }


