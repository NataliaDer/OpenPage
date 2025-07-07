package Tests;

import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CartPageTest extends BaseTest {

    @Test(priority = 1, description = "openning the page", testName = "positive test. Opening the page correctly",
            groups = {"Smoke test"})
    public void checkPageIsOpened() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.isPageOpened();
    }

    @Test(priority = 2, description = "checking the title Quantity", testName = "Positive test. check the Title QTY on the Cart page",
            groups = {"Smoke test"})
    public void checkTitleQty() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.isPageOpened();
        productsPage.addToCartProduct("Sauce Labs Bolt T-Shirt");
        cartPage.open();
        Assert.assertTrue(cartPage.isQuantityLable());
    }

    @Test(priority = 3, description = "Checking there is a product description",
            testName = "Positive test. Checking there is a product description on the Cart page", groups = {"Smoke test"},
    dependsOnMethods = "checkTitleQty")
    public void checkDescriptionTitle() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.isPageOpened();
        productsPage.addToCartProduct("Sauce Labs Bolt T-Shirt");
        cartPage.open();
        Assert.assertTrue(cartPage.isDescriptionLable());

    }

    @Test(priority = 4, description = "checking there is the button Remove", testName = "positive test. Checking the is the button Remove on the Cart page", groups = {"Smoke test"})
    public void checkButtonRemove() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.isPageOpened();
        productsPage.addToCartProduct("Sauce Labs Bolt T-Shirt");
        cartPage.open();
        Assert.assertTrue(cartPage.isButtonRemove());
    }

    @Test(priority = 7, description = "checking there is the cart icon on the cart page", testName = "Positive test. Check there is the Cart icon on the page", groups = {"Smoke test"})
    public void checkIconCart() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.isPageOpened();
        productsPage.addToCartProduct("Sauce Labs Bolt T-Shirt");
        cartPage.open();
        Assert.assertTrue(cartPage.isIconCart());
    }
//priority, description, innvocationcount-number of times the test will be run
    @Test(priority = 6, description = "positive test. Checking button checkout",invocationCount = 2, groups = {"Smoke test"})
    public void checkButtonCheckout() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.isPageOpened();
        productsPage.addToCartProduct("Sauce Labs Bolt T-Shirt");
        cartPage.open();
        Assert.assertTrue(cartPage.isButtonCheckout());
    }
}

