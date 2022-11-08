package baseTests;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.userPages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class baseTest {
    private WebDriver driver;
    protected userPages userPage;
    String BaseUrl = "http://www.way2automation.com/angularjs-protractor/webtables/";

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(BaseUrl);
        userPage = new userPages(driver);
        driver.getTitle(); //Gets the title of the application
        System.out.println("Title name: " + driver.getTitle());
    }


        @AfterMethod
        //creates reports for passed/failed tests
        public void captureScreenShot(ITestResult testResult) {  //this is a function

            driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[2]")).click();

            if (testResult.FAILURE == testResult.getStatus()) {
                TakesScreenshot screenshot = (TakesScreenshot) driver;
                File source = screenshot.getScreenshotAs(OutputType.FILE);
                File destination = new File(System.getProperty("user.dir")
                        + "/resources/Screenshots/Failed/" + testResult.getName() + "_Failed" + testResult.getEndMillis() + ".png");

                try {
                    FileHandler.copy(source, destination);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                // user.dir is a windows command
                // driver.quit(); //closed ths browser and ends the session
            }
            else  {
                TakesScreenshot screenshot = (TakesScreenshot) driver;
                File source = screenshot.getScreenshotAs(OutputType.FILE);
                File destination = new File(System.getProperty("user.dir")
                        + "/resources/Screenshots/Passed/" + testResult.getName() + "_Passed" + testResult.getEndMillis() + ".png");

                try {
                    FileHandler.copy(source, destination);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
    }
}
