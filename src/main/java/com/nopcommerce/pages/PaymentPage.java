package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class PaymentPage extends Utility {
    By cardholdername = By.xpath("//input[@id='CardholderName']");
    By cardnumber =By.xpath("//input[@id='CardNumber']");
    By expirymonth = By.xpath("//select[@id='ExpireMonth']");
    By expiredyear = By.xpath("//select[@id='ExpireYear']");
    By cardcode = By.xpath("//input[@id='CardCode']");
    By verifypaymentmethod = By.xpath("//div[@class='payment-method-info']/ul");
    By continue4 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");

    By electrocontinue = By.xpath("//span[contains(text(),'Credit Card')]");
    public void enterpaymentdetails() throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(cardholdername,"mr sapa sau");
        sendTextToElement(cardnumber,"4012888888881881");
        selectByValueFromDropDown(expirymonth,"5");
        selectByValueFromDropDown(expiredyear,"2023");
        Thread.sleep(1000);
        sendTextToElement(cardcode,"391");
        clickOnElement(continue4);
    }
    public String paymentmethod(){
        return getTextFromElement(verifypaymentmethod);

    }
    public String verifyElectrocontinue(){
        return getTextFromElement(electrocontinue);
    }
}
