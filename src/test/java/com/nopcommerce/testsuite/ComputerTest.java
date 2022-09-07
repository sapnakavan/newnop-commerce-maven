package com.nopcommerce.testsuite;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {
    ComputerPage computerPage = new ComputerPage();
    QuantityPage quantityPage = new QuantityPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    AddressPage addressPage = new AddressPage();
    PaymentPage paymentPage = new PaymentPage();


    @Test
    public void Testname(){
        computerPage.clickoncomputer();
        computerPage.clickondesktop();
        computerPage.selectztoa();
        computerPage.verifyztoa();
    }
    @Test(groups = {"smoke","sanity","regression"})
    public void  verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computerPage.clickoncomputer();
        computerPage.clickondesktop();
        computerPage.selectatoz();
        computerPage.addtocart();
        computerPage.verifybuildowncomputer();
        computerPage.setBuidcomputer();
        computerPage.verifytotal();
        computerPage.clickaddtocart();
        computerPage.verifyShoppingcartisadded();
        computerPage.clickonclosebutton();
        computerPage.setGotocart();
        computerPage.verifyshoppingcart();
        computerPage.updatecart();
        computerPage.setverifytotal();
        quantityPage.clickonterms();
        quantityPage.clickoncheckout();
        electronicsPage.verifywelcomesignin();
        quantityPage.setCheckoutasguest();
        addressPage.mandatoryfield();
        addressPage.clickoncontinue();
        quantityPage.setNextday();
        quantityPage.clickonconti();
        electronicsPage.setRadiobuttoncreditcard();
        paymentPage.enterpaymentdetails();
        paymentPage.paymentmethod();
        computerPage.verifyshipmethod();
        computerPage.verifyfinaltotal();
        quantityPage.setconfirm();
        electronicsPage.verifythankyou();
        electronicsPage.verifyordremessage();
        electronicsPage.clickonfinalcontinue();
        electronicsPage.verifywelcometostore();
    }
}
