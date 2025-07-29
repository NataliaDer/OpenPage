package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {

    private final By TITLE = By.xpath("//*[contains(text(), 'Your Cart')]");
    private final By CART_ICON = By.className("shopping_cart_link");
    private final By QUANTITY_TITLE = By.className("cart_quantity_label");
    private final By DESCRIPTION_lABLE = By.className("cart_desc_label");
    private final By CART_QUANTITY = By.className("cart_quantity");
    private final By ITEM_NAME = By.className("inventory_item_name");
    private final By ITEM_DESCRIPTION = By.className("inventory_item_desc");
    private final By ITEM_PRICE = By.className("inventory_item_price");
    private final By BUTTON_REMOVE = By.id("remove-sauce-labs-bolt-t-shirt");
    private final By BUTTON_CONTINUE = By.id("continue-shopping");
    private final By BUTTON_CHECKOUT = By.id("checkout");

    public CartPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public CartPage open() {
        driver.get(BASE_URL + "cart.html");
        return this;
    }
    @Override
    public CartPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
        return this;
    }

    public CartPage isQuantityLable() {
        driver.findElement(QUANTITY_TITLE).isDisplayed(); return this;
    }

    public CartPage isButtonRemove() {
        driver.findElement(BUTTON_REMOVE).isDisplayed(); return this;
    }

    public CartPage isIconCart() {
        driver.findElement(CART_ICON).isDisplayed(); return this;
    }

    public CartPage isDescriptionLable() {
         driver.findElement(DESCRIPTION_lABLE).isDisplayed();return this;
    }

    public CartPage isButtonCheckout() {
        driver.findElement(BUTTON_CHECKOUT).isDisplayed();return this;
    }
}