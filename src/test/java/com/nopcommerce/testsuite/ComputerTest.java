package com.nopcommerce.testsuite;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {
    ComputerPage computerPage;
    QuantityPage quantityPage;
    ElectronicsPage electronicsPage ;
    AddressPage addressPage ;
    PaymentPage paymentPage ;
@BeforeMethod(alwaysRun = true)
    public void inIt() {
    computerPage = new ComputerPage();
    quantityPage = new QuantityPage();
    electronicsPage = new ElectronicsPage();
    addressPage = new AddressPage();
    paymentPage = new PaymentPage();
}
    @Test
    public void Testname(){
        computerPage.clickoncomputer();
        computerPage.clickondesktop();
        computerPage.selectztoa();
        computerPage.verifyztoa();
    }
    @Test(groups = {"sanity"})
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
