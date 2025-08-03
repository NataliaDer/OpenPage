package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class LocatorsTest extends BaseTest {
    @Test
    public void checkBasket() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        WebElement itemName = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        softAssert.assertEquals(itemName.getAttribute("value"), "Sauce Labs Backpack");
        WebElement price = driver.findElement(By.className("inventory_item_price"));
        softAssert.assertEquals(price.getAttribute("value"), "29.99");
        softAssert.assertAll();
    }
}