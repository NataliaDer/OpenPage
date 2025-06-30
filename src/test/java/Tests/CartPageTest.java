package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CartPageTest extends BaseTest {

    @Test
    public void checkPageIsOpened() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.isPageOpened();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
    }

    @Test
    public void checkTitleQty() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.isPageOpened();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        cartPage.open();
        Assert.assertTrue(cartPage.isQuantityLable());
    }

    @Test
    public void checkDescriptionTitle() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.isPageOpened();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        cartPage.open();
        Assert.assertTrue(cartPage.isDescriptionLable());

    }

    @Test
    public void checkButtonRemove() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.isPageOpened();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        cartPage.open();
        Assert.assertTrue(cartPage.isButtonRemove());
    }

    @Test
    public void checkIconCart() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.isPageOpened();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        cartPage.open();
        Assert.assertTrue(cartPage.isIconCart());
    }

    @Test
    public void checkButtonCheckout() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.isPageOpened();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        cartPage.open();
        Assert.assertTrue(cartPage.isButtonCheckout());
    }
}

