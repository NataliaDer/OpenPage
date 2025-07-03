package Tests;

import Pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public  void checkLoginWithoutPassword(){
        loginPage.open();
        loginPage.login("standard_user", "");
        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Password is required",
                "Сообщение не соответствует");
    }

    @Test
    public  void checkLoginWithoutUserName(){
        loginPage.open();
        loginPage.login(" ", "secret_sauce");
        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Username is required",
                "Сообщение не соответствует");
    }

    @Test
    public  void checkLoginWithoutValue(){
        loginPage.open();
        loginPage.login("123 ", "123");
        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Username and password do not match any user in this service",
                "Сообщение не соответствует");
    }

    @Test
    public void checkLogin(){
        loginPage.open();
        loginPage.login("standard_user","secret_sauce");
        Assert.assertTrue(productsPage.isPageOpened());
    }
}
