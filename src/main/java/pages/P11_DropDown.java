package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P11_DropDown {
    WebDriver driver;

    public P11_DropDown(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "dropdown")
    private WebElement select;

    @FindBy(xpath = "//option[@value='1']")
    private WebElement option1;

    @FindBy(xpath = "//option[@value='2']")
    private WebElement option2;


    public void selectFromDropDown() throws InterruptedException {
        Select drpDown = new Select(select);
        Thread.sleep(1000);
          if(!option1.isSelected()) {
              drpDown.selectByIndex(1);
          }
        Thread.sleep(1000);
        if(!option2.isSelected()) {
            drpDown.selectByIndex(2);
        }
        Thread.sleep(1000);
        driver.navigate().back();
    }

}
