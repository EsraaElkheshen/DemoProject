package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P0_Home {

    WebDriver driver;

    public P0_Home(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // Define Locators

    @FindBy(xpath = "//*[text()='A/B Testing']")
    private WebElement ab_Testing;


    @FindBy(xpath = "//*[text()='Add/Remove Elements']")
    private WebElement add_Remove_Elements_Page;

    @FindBy(xpath = "//*[text()='Basic Auth']")
    private WebElement basicAuth_Page;

    @FindBy(xpath = "//*[@href='/broken_images']")
    private WebElement broken_Images_Page;

    @FindBy(xpath = "//*[text()='Challenging DOM']")
    private WebElement challenging_DOM_Page;

    @FindBy(xpath = "//*[text()='Checkboxes']")
    private WebElement check_boxes_Page;

    @FindBy(xpath = "//*[text()='Context Menu']")
    private WebElement context_Menu_Page;

    @FindBy(xpath = "//*[text()='Digest Authentication']")
    private WebElement digest_Authentication_Page;

    @FindBy(xpath = "//*[@href=\"/disappearing_elements\"]")
    private WebElement disappearing_Elements_Page;

    @FindBy(xpath = "//*[text()='Drag and Drop']")
    private WebElement drag_Drop_Page;

    @FindBy(xpath = "//*[text()='Dropdown']")
    private WebElement dropDown_Page;

    @FindBy(xpath = "//*[text()='Dynamic Content']")
    private WebElement dynamic_Content_Page;

    @FindBy(xpath = "//*[text()='Dynamic Controls']")
    private WebElement dynamic_Controls_Page;


    @FindBy(xpath = "//*[text()='Dynamic Loading']")
    private WebElement dynamic_Loading_Page;

    @FindBy(xpath = "//*[text()='Entry Ad']")
    private WebElement entry_Ad_Page;

    @FindBy(xpath = "//*[text()='Exit Intent']")
    private WebElement exit_Intent_Page;

    @FindBy(xpath = "//*[text()='File Download']")
    private WebElement file_Download_Page;

    @FindBy(xpath = "//*[text()='File Upload']")
    private WebElement file_Upload_Page;

    @FindBy(xpath = "//*[text()='Multiple Windows']")
    private WebElement multiple_Windows_Page;

    // Define Action Methods

    public void openABTestingPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(ab_Testing));
        this.ab_Testing.click();
    }

    public void openAddingRemovePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(add_Remove_Elements_Page));
        this.add_Remove_Elements_Page.click();;

    }

    public void openBasicAuthPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(basicAuth_Page));
        this.basicAuth_Page.click();


    }

    public void openBrokenImage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// Wait up to 10 seconds
        this.broken_Images_Page.click();

    }

    public void openChallengingDOM() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(challenging_DOM_Page));
        this.challenging_DOM_Page.click();


    }

    public void openCheckboxes() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(check_boxes_Page));
        this.check_boxes_Page.click();


    }

    public void openContextMenuPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(context_Menu_Page));
        this.context_Menu_Page.click();


    }

    public void openDigestAuthenticationPage() {
        this.digest_Authentication_Page.click();


    }

    public void openDisappearingElementsPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(disappearing_Elements_Page));
        this.disappearing_Elements_Page.click();


    }

    public void openDragAndDropPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(drag_Drop_Page));
        this.drag_Drop_Page.click();

    }

    public void openDropDownPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(dropDown_Page));
        this.dropDown_Page.click();
    }

    public void openDynamicContentPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(dynamic_Content_Page));
        this.dynamic_Content_Page.click();
    }

    public void openDynamicControlsPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         // Wait up to 10 seconds
        this.dynamic_Controls_Page.click();
    }

    public void openDynamicLoadingPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(dynamic_Loading_Page));
        this.dynamic_Loading_Page.click();
    }

    public void openEntryAdPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(entry_Ad_Page));
        this.entry_Ad_Page.click();
    }

    public void openExitIntentPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(exit_Intent_Page));
        this.exit_Intent_Page.click();
    }

    public void openFileDownloadPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(file_Download_Page));
        this.file_Download_Page.click();
    }

    public void openFileUploadPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(file_Upload_Page));
        this.file_Upload_Page.click();
    }

    public void openMultipleWindow() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(multiple_Windows_Page));
        this.multiple_Windows_Page.click();
    }
}
