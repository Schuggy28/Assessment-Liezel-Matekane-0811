package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class newUserPage {

    private WebDriver driver;
    private By firstname = By.name("FirstName");
    private By lastname = By.name("LastName");
    private By username = By.name("UserName");
    private By password = By.name("Password");
    private By customerA = By.xpath("/html/body[@class='ng-scope']//form[@name='smartTableValidForm']/table/tbody/tr[5]/td[2]/label[1]/input[@name='optionsRadios']");
    private By customerB = By.xpath("/html/body[@class='ng-scope']//form[@name='smartTableValidForm']/table/tbody/tr[5]/td[2]/label[2]/input[@name='optionsRadios']");
    private By role = By.name("RoleId");
    private By email = By.name("Email");
    private By mobileNumber = By.name("Mobilephone");
    private By clickSave = By.tagName("/html/body[@class='ng-scope']//button[@class='btn btn-success']");

    //Constructor
    public newUserPage(WebDriver driver) {
        this.driver = driver;
    }

    //Input Fields
    public void setFirstname(String Firstname) {
        driver.findElement(firstname).sendKeys(Firstname);
    }

    public void setLastname(String Lastname) {
        driver.findElement(lastname).sendKeys(Lastname);
    }

    public void setUsername(String Username) {
        driver.findElement(username).sendKeys(Username);
    }

    public void setPassword(String Password) {
        driver.findElement(password).sendKeys(Password);
    }

    public void setCustomerA(String CustomerA) {
        driver.findElement(customerA).click();
    }

    public void setCustomerB(String CustomerB) {
        driver.findElement(customerB).click();
    }

    public void setRole(String Role) {
        driver.findElement(role).sendKeys(Role);
    }

    public void setEmail(String Email) {
        driver.findElement(email).sendKeys(Email);
    }

    public void setMobilePhone(String MobileNo) {
        driver.findElement(mobileNumber).sendKeys(MobileNo);
    }

    public newUserPage saveBtn() {
        driver.findElement(clickSave).click();
         return new newUserPage(driver);
          }
}