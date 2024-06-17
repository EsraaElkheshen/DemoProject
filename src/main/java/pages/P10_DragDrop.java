package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P10_DragDrop {
    WebDriver driver;

    public P10_DragDrop(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "column-a")
    private WebElement draggable;

    @FindBy(id = "column-b")
    private WebElement droppable;


    public void dragAndDropElements() {

        Actions actions = new Actions(driver);

        actions.dragAndDrop(this.draggable, this.droppable).build().perform();

        driver.navigate().back();
    }

}
