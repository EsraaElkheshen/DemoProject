package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P05_ChangingDom {
    WebDriver driver;

    public P05_ChangingDom(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//tr[4]//a[text()='edit']")
    WebElement edit_Button;

    @FindBy(xpath = "//tr[4]//a[text()='delete']")
    WebElement delete_Button;

    @FindBy(xpath = "//tr[4]//td[5]")
    WebElement text;


    public void changingDoM() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Wait up to 10 seconds
        System.out.println("text in table" + text.getText());
        wait.until(ExpectedConditions.elementToBeClickable(edit_Button));
        this.edit_Button.click();
        System.out.println(driver.getCurrentUrl());
            driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(delete_Button));
        this.delete_Button.click();
            System.out.println(driver.getCurrentUrl());
            driver.navigate().back();
        driver.navigate().back();
    }

}
