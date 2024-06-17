package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P07_ContentMenu {
    WebDriver driver;

    public P07_ContentMenu(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "hot-spot")
    WebElement box;


    public void openContextBox() throws InterruptedException {
        Actions action= new Actions(driver);
        action.moveToElement(box).build().perform();
        action.contextClick(box).build().perform();
         Alert alert = driver.switchTo().alert();
         alert.accept();
         driver.findElement(By.xpath("//div[@id='page-footer']")).click();
        driver.navigate().back();

    }

}
