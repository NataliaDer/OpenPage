package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    private final By TITLE = By.xpath("//span[contains(@class, 'title') and contains(text(), 'Products')]");
    private final String PRODUCT_TSHIRT = "//div[text()='Sauce Labs Bolt T-Shirt']//ancestor::" +
            "div[@data-test='inventory-item']//button[text()='Add to cart']";
    @Override
    public ProductsPage open() {
        driver.get(BASE_URL + "/inventory.html");
        return this;
    }
    @Override
    public ProductsPage isPageOpened() {
        driver.findElement(TITLE).isDisplayed();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(TITLE));
        return this;
    }

    public ProductsPage addToCartProduct(String product){
        driver.findElement(By.xpath(String.format(PRODUCT_TSHIRT))).click();
        return this;
    }
}