package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

import java.util.Random;

public class ElectronicsPage extends Utility {
    By electronics =By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']");
    By cellphone = By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
    By verifycellphone =By.xpath("//h1[contains(text(),'Cell phones')]");
    By listviewtab = By.xpath("//a[contains(text(),'List')]");
    By nokialumia = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    By nokialumiatext =By.xpath("//h1[text()='Nokia Lumia 1020']");
    By verifyprice = By.xpath("//span[contains(text(),'$349.00')]");
    By verifytext = By.xpath("//p[@class='content']");
    By closebutton = By.xpath("//span[@title='Close']");
    By shoppingcart = By.xpath("//span[@class='cart-label']");
    By gotocart = By.xpath("//button[contains(text(),'Go to cart')]");

    By verifytotal = By.xpath("//span[@class='product-subtotal']");

    By verifywelcomesign = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By registertab = By.xpath("//a[@class='ico-register']");
    By verifyregister =By.xpath("//h1[contains(text(),'Register')]");

    By firstname = By.xpath("//input[@id='FirstName']");
    By lastname = By.xpath("//input[@id='LastName']");
    By email = By.xpath("//input[@id='Email']");
    By password = By.xpath("//input[@id='Password']");
    By confirmpass = By.xpath("//input[@id='ConfirmPassword']");
    By registerbutton =By.xpath("//button[@id='register-button']");
    By verifyregistercomp = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continuetab =By.xpath("//a[@class='button-1 register-continue-button']");
    By radiobutton2ndday = By.xpath("//input[@id='shippingoption_2']");
    By continue1 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By radiobuttoncreditcard = By.xpath("//input[@id='paymentmethod_1']");
    By creditcard = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By mastercard = By.xpath("//select[@id='CreditCardType']");
    By continuecheckout =By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");

    By verifyshippingmethod = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]");

    By verifyfinaltotal = By.xpath("//tr[@class='order-total']//strong[text()='$698.00']");

    By confirm = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    By thankyou = By.xpath("//h1[contains(text(),'Thank you')]");
    By verifyordermess= By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By finalcontinue = By.xpath("//button[contains(text(),'Continue')]");
    By verifywelcome = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By logout = By.xpath("//a[contains(text(),'Log out')]");
    By continue3 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    public void mousehoveronelectronictab(){
        mouseHoverToElement(electronics);
    }
    public void mousehoveroncellphoneandclick(){
        mouseHoverToElementAndClick(cellphone);
    }
    public String verifycellphonetext(){
        return getTextFromElement(verifycellphone);
    }

    public void clickonlisttab(){
        clickOnElement(listviewtab);
    }
    public void clickonproduct() throws InterruptedException {
        Thread.sleep(1000);
       mouseHoverToElementAndClick(nokialumia);
    }
    public String verifynokialumia() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(nokialumiatext);
    }
    public String verifypricenokia(){
        return getTextFromElement(verifyprice);
    }
    public String verifymess(){
        return getTextFromElement(verifytext);
    }
    public void clickonclosebutton(){
        clickOnElement(closebutton);
    }
    public void mousehoveronshopingcartandgotocart(){
        mouseHoverToElementAndClick(shoppingcart);
        clickOnElement(gotocart);
    }

    public String verifyTotalofProduct(){
        return getTextFromElement(verifytotal);
    }

    public String verifywelcomesignin(){
        return getTextFromElement(verifywelcomesign);
    }
    public void clickonregistertab(){
        clickOnElement(registertab);
    }
    public String verifyregistertab(){
        return getTextFromElement(verifyregister);
    }
    public void fillmandatoryfields(){
        sendTextToElement(firstname,"Test1");
        sendTextToElement(lastname,"Show");
        Random randomNum = new Random();
        int randomGenerator = randomNum.nextInt(1000);;
        sendTextToElement(email,"abc"+randomGenerator+"@gmail.com");
        sendTextToElement(password,"abc1234");
        sendTextToElement(confirmpass,"abc1234");

    }
    public void clickonregisterbutton(){
        clickOnElement(registerbutton);
    }
    public String verifyregistermess(){
        return getTextFromElement(verifyregistercomp);
    }
    public void clickoncontinue(){
        clickOnElement(continuetab);
    }
    public void clickon2nddaydelivery(){
        clickOnElement(radiobutton2ndday);
    }
    public void clickoncontinue1(){
        clickOnElement(continue1);
    }
    public void setRadiobuttoncreditcard() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(radiobuttoncreditcard);
        Thread.sleep(1000);
        clickOnElement(creditcard);
        clickOnElement(continue3);
        selectByVisibleTextFromDropDown(mastercard,"Master card");

    }
    public void clickoncheckoutcontinue(){
        clickOnElement(continuecheckout);
    }
    public String verifymethodshipping() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(verifyshippingmethod);
    }
    public String verifytotalfinal(){
        return getTextFromElement(verifyfinaltotal);
    }
    public  void clickonconfirm() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(confirm);
    }
    public String verifythankyou(){
        return getTextFromElement(thankyou);
    }
    public String verifyordremessage(){
        return getTextFromElement(verifyordermess);
    }
    public void clickonfinalcontinue()
    {
        clickOnElement(finalcontinue);
    }
    public String verifywelcometostore(){
        return getTextFromElement(verifywelcome);
    }
    public void logout(){
        clickOnElement(logout);
    }
}
