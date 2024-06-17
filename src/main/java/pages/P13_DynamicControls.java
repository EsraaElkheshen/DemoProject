package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P13_DynamicControls {
    WebDriver driver;

    public P13_DynamicControls(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@onclick=\"swapCheckbox()\"]")
    WebElement button;

    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    WebElement check_Box;

    @FindBy(xpath = "//p[@id=\"message\"]")
    WebElement message;

    @FindBy(xpath = " //button[@onclick=\"swapInput()\"]")
    WebElement enable_Disable_Button;



    public void openDynamicControls() {
        this.check_Box.click();
        this.button.click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id=\"message\"]")));
        System.out.println("message : " + message.getText());
        this.button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id=\"message\"]")));
        System.out.println("message : " + message.getText());
        this.enable_Disable_Button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id=\"message\"]")));
        System.out.println("message : " + message.getText());
        this.enable_Disable_Button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id=\"message\"]")));
        System.out.println("message : " + message.getText());
        driver.navigate().back();
    }

}
