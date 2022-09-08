package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class QuantityPage extends Utility {
    By cleartext = By.xpath("//input[@class='qty-input']");
    By changequa = By.xpath("//input[@class='qty-input']");

   By addtocart = By.xpath("//button[@class='button-1 add-to-cart-button']");

    By checkbox =By.xpath("//input[@id='termsofservice']");
    By checkout = By.xpath("//button[@id='checkout']");

    By verifyshoppingcart =By.xpath("//h1[contains(text(),'Shopping cart')]");
    By checkoutasguest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By nextday = By.xpath("//input[@id='shippingoption_1']");
    By continue4 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By confirm = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    By electroconfirm = By.xpath("//div[@class='buttons']//button[@onclick='ConfirmOrder.save()']");

    public void setChangequa(){
        driver.findElement(cleartext).clear();
        sendTextToElement(changequa,"2");


    }
    public void setAddtocart(){
        clickOnElement(addtocart);
    }
    public void clickonterms(){
        clickOnElement(checkbox);
    }
    public void clickoncheckout(){
        clickOnElement(checkout);
    }
    public void verifyShoppingcartMess(){
        getTextFromElement(verifyshoppingcart);
    }
    public void setCheckoutasguest(){
        clickOnElement(checkoutasguest);
    }
    public void setNextday(){
        clickOnElement(nextday);
    }
    public void clickonconti(){
        clickOnElement(continue4);
    }
    public void setconfirm(){
        clickOnElement(confirm);
    }
    public void clickconfirm1() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(electroconfirm);
    }


}
