package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void checkCorrectAuthorization() {
        loginPage.open()
                .enterUserName("standard_user")
                .enterPassword("secret_sauce")
                .clickLogin();//вернет ProductsPage
        productsPage.isPageOpened()
                .addToCartProduct("Sauce Labs Bolt T-Shirt");
        cartPage.open()
                .isIconCart()
                .isQuantityLable()
                .isDescriptionLable()
                .isButtonCheckout()
                .isButtonRemove();
    }
}