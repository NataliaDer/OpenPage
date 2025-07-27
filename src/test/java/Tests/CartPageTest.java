package Tests;

import Pages.CartPage;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends BaseTest {
   @Test
    public void checkCart(){
    cartPage.open()
            .isPageOpened()
            .isIconCart()
            .isQuantityLable()
            .isDescriptionLable()
            .isIconCart()
            .isButtonCheckout()
            .isButtonRemove();
}
}