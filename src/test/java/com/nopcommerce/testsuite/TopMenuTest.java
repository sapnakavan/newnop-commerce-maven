package com.nopcommerce.testsuite;

import com.nopcommerce.pages.TopmenuPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopmenuPage topmenuPage ;
@BeforeMethod(alwaysRun = true)
    public void inIt() {
    topmenuPage = new TopmenuPage();
}
    @Test(groups = {"sanity"})
    public void computernavigation(){
        topmenuPage.selectMenu("Computer");
        topmenuPage.verifycomputer();
    }
    @Test(groups = {"sanity","smoke"})
    public void electronicsnavigation(){
        topmenuPage.selectMenu("Eleectronics");
        topmenuPage.verifyelectronics();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void apparelnavigation(){
        topmenuPage.selectMenu("Apparel");
        topmenuPage.verifyapparels();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void digitaldownloadsnavigation(){
        topmenuPage.selectMenu("Digital Downloads");
        topmenuPage.verifydigitaldownloads();
    }
    @Test(groups = {"sanity"})
    public void booksnavigation(){
        topmenuPage.selectMenu("Books");
        topmenuPage.verifybooks();
    }
    @Test(groups = {"sanity","smoke"})
    public void jewelerynavigation(){
        topmenuPage.selectMenu("Jewelry");
        topmenuPage.verifyjeweler();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void giftcardnavigation(){
        topmenuPage.selectMenu("Gift Cards");
        topmenuPage.verifygiftcard();
    }
}
