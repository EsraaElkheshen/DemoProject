package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P09_DisappearingElements {
    WebDriver driver;

    public P09_DisappearingElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[text()='Home']")
    WebElement home_Label;

    @FindBy(xpath = "//*[text()='About']")
    WebElement about_Label;

    @FindBy(xpath = "//*[text()='Contact Us']")
    WebElement contactUs_Label;

    @FindBy(xpath = "//*[text()='Portfolio']")
    WebElement portfolio_Label;

    @FindBy(xpath = "//h1")
    WebElement not_FoundWord;

    public void disappearingElements() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
        System.out.println("Label : " + home_Label.getText());
        System.out.println("Label :" + about_Label.getText());
        //wait.until(ExpectedConditions.elementToBeClickable(about_Label));
        this.about_Label.click();
        System.out.println("Text :" + not_FoundWord.getText());
        driver.navigate().back();
        System.out.println("Label : " + contactUs_Label.getText());
       // wait.until(ExpectedConditions.elementToBeClickable(contactUs_Label));
        this.contactUs_Label.click();
        System.out.println("Text :" + not_FoundWord.getText());
        driver.navigate().back();
        System.out.println("Label : " + portfolio_Label.getText());
        //wait.until(ExpectedConditions.elementToBeClickable(portfolio_Label));
        this.portfolio_Label.click();
        System.out.println("Text :" + not_FoundWord.getText());
        driver.navigate().back();
        //wait.until(ExpectedConditions.elementToBeClickable(home_Label));
        this.home_Label.click();

    }

}
