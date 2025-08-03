package tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
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