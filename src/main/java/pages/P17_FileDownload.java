package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P17_FileDownload {
    WebDriver driver;

    public P17_FileDownload(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(xpath = "//a[text()='sample-zip-file.zip']")
    WebElement btnDownload;

    public void downloadFile() throws InterruptedException {
        this.btnDownload.click();
        Thread.sleep(2000);
        driver.navigate().back();

    }

}
