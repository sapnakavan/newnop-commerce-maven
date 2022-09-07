package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By computer = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a");
    By desktop = By.xpath("//div[@class='category-grid sub-category-grid']//a[text()=' Desktops ']");
    By ztoa = By.xpath("//select[@id='products-orderby']");
    By verifyztoa = By.xpath("//select[@id='products-orderby']/option[3]");
    By atoz =By.xpath("//select[@id='products-orderby']");
    By addtocart = By.xpath("//div[@class='item-box'][1]//button[text()='Add to cart']");
    By buidcomputer = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By dualcore = By.xpath("//select[@name='product_attribute_1']");
    By gb = By.xpath("//select[@id='product_attribute_2']");
    By hddradio = By.xpath("//input[@id='product_attribute_3_7']");
    By vistaprimium = By.xpath("//input[@id='product_attribute_4_9']");
    By microsoft = By.xpath("//input[@id='product_attribute_5_12']");
    By verifytotal = By.xpath("//span[@class='price-value-1']");
    By addtocart1 = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifymess =By.xpath("//div[@id='bar-notification']/div[1]/p");
    By crossbutton = By.xpath("//span[@class='close']");
    By shoppingcart = By.xpath("//div[@class='header-links']/ul[1]/li[4]");
    By gotocart = By.xpath("//button[contains(text(),'Go to cart')]");
    By verifyshopping =By.xpath("//div[@class='page-title']");
    By cleartext = By.xpath("//input[@class='qty-input']");
    By changeite = By.xpath("//input[@class='qty-input']");
    By updatecart =By.xpath("//button[@id='updatecart']");
    By verifytotal1 = By.xpath("//span[@class='product-subtotal']");
    By shippmethod  = By.xpath("//div[@class='shipping-method-info']/ul");
    By totalfi = By.xpath("//tr[@class='order-total']/td[2]");


    public void clickoncomputer(){
        clickOnElement(computer);
    }
    public void clickondesktop(){
        clickOnElement(desktop);
    }
    public void selectztoa(){
        selectByVisibleTextFromDropDown(ztoa,"Name: Z to A");
    }
    public String verifyztoa(){
        return getTextFromElement(verifyztoa);
    }
    public void selectatoz() throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(atoz,"Name: A to Z");
    }
    public void addtocart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(addtocart);
    }
    public String verifybuildowncomputer(){
        return getTextFromElement(buidcomputer);
    }
    public void setBuidcomputer() throws InterruptedException {
        selectByValueFromDropDown(dualcore,"1");
        selectByValueFromDropDown(gb,"5");
        Thread.sleep(1000);
        clickOnElement(hddradio);
        Thread.sleep(1000);
        clickOnElement(vistaprimium);
        Thread.sleep(1000);
        clickOnElement(microsoft);
        Thread.sleep(1000);

    }
    public String verifytotal(){
        return getTextFromElement(verifytotal);
    }
    public void clickaddtocart(){
        clickOnElement(addtocart1);
    }
    public String verifyShoppingcartisadded(){
        return getTextFromElement(verifymess);
    }
    public void clickonclosebutton(){
        clickOnElement(crossbutton);

    }
    public void setGotocart() throws InterruptedException {
        mouseHoverToElement(shoppingcart);
        Thread.sleep(1000);
        clickOnElement(gotocart);
    }
    public String verifyshoppingcart(){
        return getTextFromElement(verifyshopping);
    }
    public void updatecart(){
        driver.findElement(cleartext).clear();
        sendTextToElement(changeite,"2");
        clickOnElement(updatecart);
    }
    public String setverifytotal(){
        return getTextFromElement(verifytotal1);
    }
    public String verifyshipmethod(){
        return getTextFromElement(shippmethod);
    }
    public String verifyfinaltotal(){
        return getTextFromElement(totalfi);
    }
}
