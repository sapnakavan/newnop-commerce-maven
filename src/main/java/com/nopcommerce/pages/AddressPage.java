package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class AddressPage extends Utility {
    By firstname = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastname = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By clearemail = By.xpath("//input[@id='BillingNewAddress_Email']");
    By email = By.xpath("//input[@id='BillingNewAddress_Email']");
    By company = By.xpath("//input[@id='BillingNewAddress_Company']");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By state = By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By add = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postcode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneno = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By save = By.xpath("//button[@onclick='Billing.save()']");
    By continue2 = By.xpath("//button[@onclick='Billing.save()']");



    public void mandatoryfield() throws InterruptedException {

        sendTextToElement(firstname,"kem");
        sendTextToElement(lastname,"dew");
        Thread.sleep(1000);
        driver.findElement(clearemail).clear();
        sendTextToElement(email,"sdc@yahoo.com");
        sendTextToElement(company,"avf");
        selectByVisibleTextFromDropDown(country,"United States");
        selectByVisibleTextFromDropDown(state,"California");
        sendTextToElement(city,"london");
        sendTextToElement(add,"harrow");
        sendTextToElement(postcode,"ha3 8ew");
        sendTextToElement(phoneno,"78542635998");
        clickOnElement(save);

    }
    public void clickoncontinue(){
        clickOnElement(continue2);
    }
}
