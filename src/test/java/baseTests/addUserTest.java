package baseTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.newUserPage;


public class addUserTest extends baseTest {
    @Test(priority = 1, dataProvider = "userData")
    public void addUser(String firstname, String lastname, String username, String password, String CustomerA, String role, String
            email, String mobileNumber) {

        newUserPage newUser = userPage.clickAdd("/html/body/table/thead/tr[2]/td/button");
        newUser.setFirstname(firstname);
        newUser.setLastname(lastname);
        newUser.setUsername(username);
        newUser.setPassword(password);
        newUser.setCustomerA(CustomerA);
        newUser.setRole(role);
        newUser.setEmail(email);
        newUser.setMobilePhone(mobileNumber);

    }

    @DataProvider() //is used to provide or bring back data
    public Object[][] userData() {  //this is a two-dimensional array which means has a row and column
        Object[][] data = new Object[1][8]; //I want 1 row, Index = 8 columns

        data[0][0] = "Fname1";
        data[0][1] = "Lname1";
        data[0][2] = "User1";
        data[0][3] = "Pass1!";
        data[0][4] = "Company AAA";
        data[0][5] = "Admin";
        data[0][6] = "admin@mail.cm";
        data[0][7] = "082555!";
        return data;
    }

    @Test(priority = 2, dataProvider = "userData2")
    public void addUser2(String firstname, String lastname, String username, String password, String CustomerB, String role, String
            email, String mobileNumber) {

        newUserPage newUser = userPage.clickAdd("/html/body/table/thead/tr[2]/td/button");
        newUser.setFirstname(firstname);
        newUser.setLastname(lastname);
        newUser.setUsername(username);
        newUser.setPassword(password);
        newUser.setCustomerB(CustomerB);
        newUser.setRole(role);
        newUser.setEmail(email);
        newUser.setMobilePhone(mobileNumber);
    }

    @DataProvider() //is used to provide or bring back data
    public Object[][] userData2() {  //this is a two-dimensional array which means has a row and column
        Object[][] data = new Object[1][8]; //I want 1 row, Index = 8 columns
        data[0][0] = "Fname2";
        data[0][1] = "Lname2";
        data[0][2] = "User2";
        data[0][3] = "Pass2!";
        data[0][4] = "Company BBB";
        data[0][5] = "Customer";
        data[0][6] = "customer@mail.cm";
        data[0][7] = "082444!";

        return data;
    }


}