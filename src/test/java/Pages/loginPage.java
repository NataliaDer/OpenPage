package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends basePage {
    private WebDriverWait wait;

    private final By LOGIN_FIELD = By.id("user-name");
    private final By PASSWORD_FIELD = By.id("password");
    private final By LOGIN_BUTTON = By.id("login-button");

    public loginPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public loginPage open() {
        driver.get(BASE_URL);
        return this;
    }

    @Override
    public loginPage isPageOpened(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_FIELD));
        return this;
    }
    public loginPage enterUserName(String user){
        driver.findElement(LOGIN_FIELD).sendKeys(user);
        return this;
    }

    public loginPage enterPassword(String password) {
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
        return this;
    }

    public productsPage clickLogin() {
        driver.findElement(LOGIN_BUTTON).click();
        return new productsPage(driver);
    }
}