package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class newUserPage {
    private WebDriver driver;
    private By firstname = By.name("FirstName");
    private By lastname = By.name("LastName");
    private By username = By.name("UserName");
    private By password = By.name("Password");
    private By customer = By.name("optionsRadios");
    private By role = By.name("RoleId");
    private By email = By.name("Email");
    private By mobileNumber = By.name("Mobilephone");



    public newUserPage(WebDriver driver) {
        this.driver = driver;

    }

    public void setFirstname(String username) {
        driver.findElement(firstname).sendKeys(username);
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

    public void setCustomer(String Customer) {
        driver.findElement(customer).sendKeys(Customer);
    }

    public void setRole(String Role) {
        driver.findElement(role).sendKeys(Role);
    }

    public void setEmail(String Email) {
        driver.findElement(email).sendKeys(Email);
    }

    public void setMobilePhone(String MobileNo) {
        driver.findElement(mobileNumber).sendKeys(MobileNo);}


}
