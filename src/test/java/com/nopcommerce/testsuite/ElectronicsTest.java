package com.nopcommerce.testsuite;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    QuantityPage quantityPage;
    ElectronicsPage electronicsPage ;
    AddressPage addressPage ;
    PaymentPage paymentPage ;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        quantityPage = new QuantityPage();
        electronicsPage = new ElectronicsPage();
        addressPage = new AddressPage();
        paymentPage = new PaymentPage();
    }
    @Test
    public void testverified(){
        electronicsPage.mousehoveronelectronictab();
        electronicsPage.mousehoveroncellphoneandclick();
        electronicsPage.verifycellphonetext();
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        this.testverified();
        electronicsPage.clickonlisttab();
        electronicsPage.clickonproduct();
        electronicsPage.verifynokialumia();
        electronicsPage.verifypricenokia();
        quantityPage.setChangequa();
        quantityPage.setAddtocart();
        electronicsPage.verifymess();
        electronicsPage.clickonclosebutton();
        electronicsPage.mousehoveronshopingcartandgotocart();
        quantityPage.verifyShoppingcartMess();
        electronicsPage.verifyTotalofProduct();
        quantityPage.clickonterms();
        quantityPage.clickoncheckout();
        electronicsPage.verifywelcomesignin();
        electronicsPage.clickonregistertab();
        electronicsPage.verifyregistertab();
        electronicsPage.fillmandatoryfields();
        electronicsPage.clickonregisterbutton();
        electronicsPage.verifyregistermess();
        electronicsPage.clickoncontinue();
        quantityPage.verifyShoppingcartMess();
        quantityPage.clickonterms();
        quantityPage.clickoncheckout();
        addressPage.mandatoryfield();
        electronicsPage.clickon2nddaydelivery();
        electronicsPage.clickoncontinue1();
        electronicsPage.setRadiobuttoncreditcard();
       paymentPage.enterpaymentdetails();
       paymentPage.paymentmethod();
       electronicsPage.clickoncheckoutcontinue();
       paymentPage.verifyElectrocontinue();
       electronicsPage.verifymethodshipping();
       electronicsPage.verifytotalfinal();
       electronicsPage.clickonconfirm();
       electronicsPage.verifythankyou();
       electronicsPage.verifyordremessage();
       electronicsPage.clickonfinalcontinue();
       electronicsPage.verifywelcometostore();
       electronicsPage.logout();
    }
}
