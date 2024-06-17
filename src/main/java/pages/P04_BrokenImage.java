package pages;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class P04_BrokenImage {
    WebDriver driver;

    public P04_BrokenImage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public void openBrokenImages() {
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total no. of images are " + images.size());
        // Iterate through each image and check if it's broken
        for (WebElement image : images) {
            String imageUrl = image.getAttribute("src");
            try {
                // Create a URL object
                URL url = new URL(imageUrl);
                // Open a connection
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                // Set the request method
                connection.setRequestMethod("GET");

                // Get the response code
                int responseCode = connection.getResponseCode();

                // Close the connection
                connection.disconnect();

                // Check if the response code indicates a broken image
                if (responseCode != HttpURLConnection.HTTP_OK) {
                    System.out.println("Broken Image: " + imageUrl);
                }
            } catch (IOException e) {
                // Exception occurred, handle accordingly
                e.printStackTrace();
            }
        }

        // Close the browser
       driver.navigate().back();
    }
        /*
        try {
            invalidImageCount = 0;
            List imagesList = (List) driver.findElements(By.tagName("img"));
            System.out.println("Total no. of images are " + imagesList.size());
            for (WebElement imgElement : imagesList) {
                if (imgElement != null) {
                    verifyimageActive(imgElement);
                }
            }
            System.out.println("Total no. of invalid images are " + invalidImageCount);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    public void verifyimageActive(WebElement imgElement) {
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(imgElement.getAttribute("src"));
            HttpResponse response = (HttpResponse) client.execute(request);
            // verifying response code he HttpStatus should be 200 if not,
            // increment as invalid images count
            if (response.getStatus().getCode() != 200)
                invalidImageCount++;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }*/

}
