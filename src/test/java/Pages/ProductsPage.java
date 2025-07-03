package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    private final By TITLE = By.className("title");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "/inventory.html");
    }

    private final String PRODUCT_TSHIRT = "//div[text()='Sauce Labs Bolt T-Shirt']//ancestor::" +
            "div[@data-test='inventory-item']//button[text()='Add to cart']";

    public boolean isPageOpened() {
        return driver.findElement(TITLE).isDisplayed();
    }

    public void addToCartProduct(String product){
        driver.findElement(By.xpath(String.format(PRODUCT_TSHIRT))).click();
    }
}
