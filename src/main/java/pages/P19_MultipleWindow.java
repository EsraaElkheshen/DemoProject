package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class P19_MultipleWindow {
    WebDriver driver;

    public P19_MultipleWindow(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(linkText = "Click Here")
    private WebElement new_Window;

    public void openMultipleWindow() {
        this.new_Window.click();
        String message = driver.findElement(By.xpath("//*[@id=\"content\"]//h3")).getText();
        System.out.println(message);
        // It will return the parent window name as a String
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);

                System.out.println(driver.switchTo().window(child_window).getTitle());

                driver.close();
            }

        }
//switch to the parent window
        driver.switchTo().window(parent);
        System.out.println("Child window closed");
        driver.navigate().back();
    }
}
