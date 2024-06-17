package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P14_DynamicLoading {
    WebDriver driver;

    public P14_DynamicLoading(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[text()='Example 1: Element on page that is hidden']")
    WebElement link1;

    @FindBy(xpath = "//*[text()='Example 2: Element rendered after the fact']")
    WebElement link2;

    @FindBy(xpath = "//button[text()='Start']")
    WebElement start_Btn;

    @FindBy(xpath = "//*[@id='finish']//h4")
    WebElement link_Text;



    public void openDynamicLoading() {
        this.link1.click();
        this.start_Btn.click();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='finish']//h4")));
        System.out.println("First Message : " + link_Text.getText());
         driver.navigate().back();
         this.link2.click();
        this.start_Btn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='finish']//h4")));
        System.out.println("Second Message : " + link_Text.getText());
        driver.navigate().back();
        driver.navigate().back();

    }

}
