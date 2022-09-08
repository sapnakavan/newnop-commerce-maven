package com.nopcommerce.testsuite;

import com.nopcommerce.pages.AddressPage;
import com.nopcommerce.pages.ElectronicsPage;
import com.nopcommerce.pages.PaymentPage;
import com.nopcommerce.pages.QuantityPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    ElectronicsPage electronics = new ElectronicsPage();
    AddressPage addressPage = new AddressPage();
    QuantityPage quantityPage = new QuantityPage();
    PaymentPage paymentPage = new PaymentPage();
    @Test
    public void testverified(){
        electronics.mousehoveronelectronictab();
        electronics.mousehoveroncellphoneandclick();
        electronics.verifycellphonetext();
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        this.testverified();
        electronics.clickonlisttab();
        electronics.clickonproduct();
        electronics.verifynokialumia();
        electronics.verifypricenokia();
        quantityPage.setChangequa();
        quantityPage.setAddtocart();
        electronics.verifymess();
        electronics.clickonclosebutton();
        electronics.mousehoveronshopingcartandgotocart();
        quantityPage.verifyShoppingcartMess();
        electronics.verifyTotalofProduct();
        quantityPage.clickonterms();
        quantityPage.clickoncheckout();
        electronics.verifywelcomesignin();
        electronics.clickonregistertab();
        electronics.verifyregistertab();
        electronics.fillmandatoryfields();
        electronics.clickonregisterbutton();
        electronics.verifyregistermess();
        electronics.clickoncontinue();
        quantityPage.verifyShoppingcartMess();
        quantityPage.clickonterms();
        quantityPage.clickoncheckout();
        addressPage.mandatoryfield();
        electronics.clickon2nddaydelivery();
        electronics.clickoncontinue1();
        electronics.setRadiobuttoncreditcard();
       paymentPage.enterpaymentdetails();
       paymentPage.paymentmethod();
       electronics.clickoncheckoutcontinue();
       paymentPage.verifyElectrocontinue();
       electronics.verifymethodshipping();
       electronics.verifytotalfinal();
       quantityPage.clickconfirm1();
       electronics.verifythankyou();
       electronics.verifyordremessage();
       electronics.clickonfinalcontinue();
       electronics.verifywelcometostore();
       electronics.logout();
    }
}
