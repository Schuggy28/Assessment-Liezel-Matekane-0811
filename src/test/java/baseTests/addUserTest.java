package baseTests;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.newUserPage;

public class addUserTest extends baseTest {
    @Test (priority = 1, dataProvider = "userData")
        public void addUser(String firstname, String lastname, String username, String password,String customer, String role, String
        email,String mobileNumber) {

        newUserPage newUser = userPage.clickAdd("/html/body/table/thead/tr[2]/td/button");
        newUser.setFirstname(firstname);
        newUser.setLastname(lastname);
        newUser.setUsername(username);
        newUser.setPassword(password);
//      newUser.setCustomer(String.valueOf(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]/input")));
        newUser.setCustomer(String.valueOf(By.tagName("//input[@name='optionsRadios']")));
        newUser.setRole(role);
        newUser.setEmail(email);
        newUser.setMobilePhone(mobileNumber);


    }
        @DataProvider() //is used to provide or bring back data
        public Object[][] userData(){  //this is a two-dimensional array which means has a row and column
            Object [][] data = new Object [2][8]; //I want 1 row, Index = 8 columns

            data [0][0] = "Fname1";
            data [0][1] = "Lname1";
            data [0][2] = "User1";
            data [0][3] = "Pass1!";
            data [0][4] = "";
            data [0][5] = "Admin";
            data [0][6] = "admin@mail.cm";
            data [0][7] = "082555!";

            data [1][0] = "Fname2";
            data [1][1] = "Lname2";
            data [1][2] = "User2";
            data [1][3] = "Pass2!";
            data [1][4] = "";
            data [1][5] = "Customer";
            data [1][6] = "customer@mail.cm";
            data [1][7] = "082444!";

            return data;
        }
    }
