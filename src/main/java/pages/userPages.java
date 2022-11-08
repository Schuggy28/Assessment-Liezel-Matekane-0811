package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class userPages {
    public WebDriver driver;
    private By addLink = By.xpath("/html/body/table/thread/tr[2]/td/button");


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