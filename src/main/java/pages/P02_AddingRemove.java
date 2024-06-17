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

public class P02_AddingRemove {
    WebDriver driver;

    public P02_AddingRemove(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@onclick=\"addElement()\"]")
    WebElement add_Element_Btn;

    @FindBy(xpath = "//*[@onclick=\"deleteElement()\"]")
    WebElement delete_Element_Btn;


    public void addAndRemoveElements() {
        this.add_Element_Btn.click();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@onclick=\"deleteElement()\"]")));
        this.delete_Element_Btn.click();
        driver.navigate().back();
    }

}
