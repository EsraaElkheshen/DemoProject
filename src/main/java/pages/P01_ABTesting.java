package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_ABTesting {
    WebDriver driver;
    public P01_ABTesting(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    @FindBy(xpath = "//*[@id='content']//p")
    WebElement message;



  public void getMessageText(){
      System.out.println(message.getText());
      driver.navigate().back();
  }

}
