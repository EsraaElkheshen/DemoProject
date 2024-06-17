package pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.Set;


public class P18_FileUpload {
    WebDriver driver;

    public P18_FileUpload(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "file-upload")
    WebElement choose_File;

    @FindBy(id = "file-submit")
    WebElement btnUpload;

    @FindBy(xpath = "//*[text()='File Uploaded!']")
    WebElement message;

    public void uploadFile() throws InterruptedException {
        File file = new File("uploads/img.jpg");
        choose_File.sendKeys(file.getAbsolutePath());
        btnUpload.click();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='File Uploaded!']")));
        if (driver.findElement(By.xpath("//*[text()='File Uploaded!']")).isDisplayed()) {
            System.out.println(message.getText());
            driver.navigate().back();
        } else {
            System.out.println("Profile picture not Uploaded");
        }

        driver.navigate().back();

    }

}
