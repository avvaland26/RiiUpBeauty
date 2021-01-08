package WebTest;

import org.openqa.selenium.By;

public class Shipping extends Util{

    private By _ShippingPage = By.xpath("//header[@class=\"page__header page__header--centered\"]");
    String ExpectedResult = "Shipping";

    public void verifyUserOnShippingPage(){
        assertUrl("shipping");
        System.out.println("shipping");

    }
    public void verifyShippingText(){
        assertTextMessage(getTextEliment(_ShippingPage),ExpectedResult,"Shipping");
        System.out.println("Shipping");
    }

}
