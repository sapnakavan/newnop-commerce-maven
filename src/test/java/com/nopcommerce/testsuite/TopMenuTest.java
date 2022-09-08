package com.nopcommerce.testsuite;

import com.nopcommerce.pages.TopmenuPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopmenuPage topmenuPage = new TopmenuPage();

    @Test
    public void computernavigation(){
        topmenuPage.selectMenu("Computer");
        topmenuPage.verifycomputer();
    }
    @Test
    public void electronicsnavigation(){
        topmenuPage.selectMenu("Eleectronics");
        topmenuPage.verifyelectronics();
    }
    @Test
    public void apparelnavigation(){
        topmenuPage.selectMenu("Apparel");
        topmenuPage.verifyapparels();
    }
    @Test
    public void digitaldownloadsnavigation(){
        topmenuPage.selectMenu("Digital Downloads");
        topmenuPage.verifydigitaldownloads();
    }
    @Test
    public void booksnavigation(){
        topmenuPage.selectMenu("Books");
        topmenuPage.verifybooks();
    }
    @Test
    public void jewelerynavigation(){
        topmenuPage.selectMenu("Jewelry");
        topmenuPage.verifyjeweler();
    }
    @Test
    public void giftcardnavigation(){
        topmenuPage.selectMenu("Gift Cards");
        topmenuPage.verifygiftcard();
    }
}
