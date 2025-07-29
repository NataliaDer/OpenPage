package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public abstract class basePage {
    protected final String BASE_URL = "https://www.saucedemo.com/";
     WebDriver driver;
     WebDriverWait wait;

    public basePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public abstract basePage open();
    public abstract basePage isPageOpened();
}