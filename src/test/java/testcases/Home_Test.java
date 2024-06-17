package testcases;

import org.testng.annotations.Test;
import pages.*;

public class Home_Test extends Test_Base {

    @Test(priority = 1, description = "Opening A/B Testing Page")
    public void checkOpeningABTestingPage_P() {
        P0_Home home = new P0_Home(driver);
        home.openABTestingPage();
        P01_ABTesting testingPage = new P01_ABTesting(driver);
        testingPage.getMessageText();
    }


    @Test(priority = 2, description = "Opening Adding/ Remove Page")
    public void checkOpeningAddingRemovePage_P() {
        P0_Home home = new P0_Home(driver);
        home.openAddingRemovePage();
        P02_AddingRemove addingRemovingPage = new P02_AddingRemove(driver);
        addingRemovingPage.addAndRemoveElements();
    }

    @Test(priority = 3, description = "Opening Broken Images Page")
    public void checkOpeningBrokenImages_P() {
        P0_Home home = new P0_Home(driver);
        home.openBrokenImage();
        P04_BrokenImage brokenImage = new P04_BrokenImage(driver);
        brokenImage.openBrokenImages();

    }

    @Test(priority = 4, description = "Opening Challenging DOM Page")
    public void checkOpeningChallengingDOM_P() {
        P0_Home home = new P0_Home(driver);
        home.openChallengingDOM();
        P05_ChangingDom changingDom = new P05_ChangingDom(driver);
        changingDom.changingDoM();
    }

    @Test(priority = 5, description = "Opening Check boxes Page")
    public void checkOpeningCheckboxes_P() {
        P0_Home home = new P0_Home(driver);
        home.openCheckboxes();
        P06_CheckBox checkBox = new P06_CheckBox(driver);
        checkBox.clickOnCheckBox();
    }

    @Test(priority = 6, description = "Opening Context Menu Page")
    public void checkOpeningContextMenuPage_P() throws InterruptedException {
        P0_Home home = new P0_Home(driver);
        home.openContextMenuPage();
        P07_ContentMenu contentMenu = new P07_ContentMenu(driver);
        contentMenu.openContextBox();
    }

    @Test(priority = 7, description = "Opening Disappearing Elements Page")
    public void checkOpeningDisappearingElementsPage_P() {
        P0_Home home = new P0_Home(driver);
        home.openDisappearingElementsPage();
        P09_DisappearingElements disappearingElements = new P09_DisappearingElements(driver);
        disappearingElements.disappearingElements();
    }

    @Test(priority = 8, description = "Opening Drag And Drop Page")
    public void checkOpeningDragAndDropPage_P() throws InterruptedException {
        P0_Home home = new P0_Home(driver);
        home.openDragAndDropPage();
        P10_DragDrop dragAndDrop = new P10_DragDrop(driver);
        dragAndDrop.dragAndDropElements();
    }

    @Test(priority = 9, description = "Opening Drop DownPage")
    public void checkOpeningDropDownPage_P() throws InterruptedException {
        P0_Home home = new P0_Home(driver);
        home.openDropDownPage();
        P11_DropDown dropDown = new P11_DropDown(driver);
        dropDown.selectFromDropDown();
    }

    @Test(priority = 10, description = "Opening Dynamic ContentPage")
    public void checkOpeningDynamicContentPage_P() {
        P0_Home home = new P0_Home(driver);
        home.openDynamicContentPage();
        P12_DynamicContent dynamicContent = new P12_DynamicContent(driver);
        dynamicContent.printDynamicContent();
    }

    @Test(priority = 11, description = "Opening Dynamic Controls Page")
    public void checkOpeningDynamicControlsPage_P() {
        P0_Home home = new P0_Home(driver);
        home.openDynamicControlsPage();
        P13_DynamicControls dynamicControls = new P13_DynamicControls(driver);
        dynamicControls.openDynamicControls();
    }

    @Test(priority = 12, description = "Opening Dynamic Loading")
    public void checkOpeningDynamicLoadingPage() {
        P0_Home home = new P0_Home(driver);
        home.openDynamicLoadingPage();
        P14_DynamicLoading dynamicLoading = new P14_DynamicLoading(driver);
        dynamicLoading.openDynamicLoading();
    }


    @Test(priority = 13, description = "Opening Entry Ad Page")
    public void checkOpeningEntryAdPage_P() throws InterruptedException {
        P0_Home home = new P0_Home(driver);
        home.openEntryAdPage();
        P15_EntryAdd entryAdd = new P15_EntryAdd(driver);
        entryAdd.openAddEntry();
    }

    @Test(priority = 14, description = "Opening Exit Intent Page")
    public void checkOpeningExitIntentPage_P() throws InterruptedException {
        P0_Home home = new P0_Home(driver);
        home.openExitIntentPage();
        P16_ExitIntent exitIntent = new P16_ExitIntent(driver);
        exitIntent.openExitIntent();

    }

    @Test(priority = 15, description = "Opening File Download Page")
    public void checkOpeningFileDownloadPage_P() throws InterruptedException {
        P0_Home home = new P0_Home(driver);
        home.openFileDownloadPage();
        P17_FileDownload fileDownload = new P17_FileDownload(driver);
        fileDownload.downloadFile();
    }

    @Test(priority = 16, description = "Opening File Upload Page")
    public void checkOpeningFileUploadPage_P() throws InterruptedException {
        P0_Home home = new P0_Home(driver);
        home.openFileUploadPage();
        P18_FileUpload fileUpload = new P18_FileUpload(driver);
        fileUpload.uploadFile();
    }

    @Test(priority = 17, description = "Opening Multiple Window Page")
    public void checkOpeningMultipleWindowPage_P() throws InterruptedException {
        P0_Home home = new P0_Home(driver);
        home.openMultipleWindow();
        P19_MultipleWindow multipleWindow = new P19_MultipleWindow(driver);
        multipleWindow.openMultipleWindow();
    }

    @Test(priority = 18, description = "Opening Authentication Page")
    public void checkOpeningAuthenticationPage_P() throws InterruptedException {
        P0_Home home = new P0_Home(driver);
        home.openBasicAuthPage();
        P03_BasicAuth basicAuthentication = new P03_BasicAuth(driver);
        basicAuthentication.openBasicAuthPages();
    }

    @Test(priority = 19, description = "Opening Digest Authentication Page")
    public void checkOpeningDigestAuthenticationPage_P() {
        P0_Home home = new P0_Home(driver);
        home.openDigestAuthenticationPage();
        P08_DigestAuthentication digestAuthentication = new P08_DigestAuthentication(driver);
        digestAuthentication.openDigestAuthentication();
    }
}
