package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class userPages {
    public WebDriver driver;
    private By clickAdd = By.xpath("/html/body/div[3]/div[3]/button[2]");
    public userPages(WebDriver driver) {
    this.driver = driver;
    }

    public newUserPage clickAdd(String xpath) {
    clickButtonLink(xpath);
    return new newUserPage(driver);
}
    public void clickButtonLink(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }

}