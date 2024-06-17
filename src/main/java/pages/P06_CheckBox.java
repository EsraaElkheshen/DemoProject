package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P06_CheckBox {
    WebDriver driver;

    public P06_CheckBox(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@type=\"checkbox\"][1]")
    WebElement check_Box1;

    @FindBy(xpath = "//input[@type=\"checkbox\"][2]")
    WebElement check_Box2;




    public void clickOnCheckBox() {

        if (!check_Box1.isSelected()) {
            this.check_Box1.click();
        }

        if (!check_Box2.isSelected()) {
            this.check_Box2.click();
        }
        driver.navigate().back();


    }

}
