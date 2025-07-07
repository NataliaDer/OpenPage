package Tests;

import Pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test(priority = 3, description = "Негативный тест. Проверка авторизации без пароля, но с корректным логином", groups = {"Negative tests"})
    public  void checkLoginWithoutPassword(){
        loginPage.open();
        loginPage.login("standard_user", "");
        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Password is required",
                "Сообщение не соответствует");
    }

    @Test(priority = 2, description = "Негативный тест. Проверка авторизации без логина, но с корректным паролем",groups = {"Negative tests"})
    public  void checkLoginWithoutUserName(){
        loginPage.open();
        loginPage.login("", "secret_sauce");
        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Username is required",
                "Сообщение не соответствует");
    }

    @Test(priority = 4, description = "Негативный тест.Проверка авторизации с некорректными значениями", groups = {"Negative tests"})
    public  void checkLoginWithoutValue(){
        loginPage.open();
        loginPage.login("123 ", "123");
        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Username and password do not match any user in this service",
                "Сообщение не соответствует");
    }

    @Test(priority = 1,description = "проверка авторизации с корректными логином и паролем", groups = {"Positive tests"})
    public void checkLogin(){
        loginPage.open();
        loginPage.login("standard_user","secret_sauce");
        Assert.assertTrue(productsPage.isPageOpened());
    }

    @DataProvider (name = "LoginData")
    public Object[][] loginData(){
        return  new Object[][]{
                {"standard_user","","Epic sadface: Password is required"},
                {"","secret_sauce","Epic sadface: Username is required"},
                {"nqwe","qweqw","Epic sadface: Username and password do not match any user in this service"}
        };
    }

    @Test (dataProvider = "LoginData")
    public  void checkLoginWithNegativeValue(String user, String password, String expectedMessage){
        loginPage.open();
        loginPage.login(user, password);
        Assert.assertEquals(loginPage.getErrorMessage(),expectedMessage,
                "Сообщение не соответствует");
    }
}
