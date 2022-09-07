package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopmenuPage extends Utility {
    By topmenuheader = By.xpath("//div[@class='header-menu']/ul[1]");
    By computer = By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a");
    By electronics = By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a");
    By apparel = By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a");
    By digitaldownloads =By.xpath("//div[@class='header-menu']/ul[1]/li[4]/a");
    By books = By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a");
    By jewelery = By.xpath("//div[@class='header-menu']/ul[1]/li[6]/a");
    By giftcard =By.xpath("//div[@class='header-menu']/ul[1]/li[7]/a");

    public void selectMenu(String menu) {
        List<WebElement> topMenuName = driver.findElements(topmenuheader);

        for (WebElement name : topMenuName) {
            if (name.getText().equalsIgnoreCase(menu)) {
                name.click();
                break;
            }
        }
    }
    public String verifycomputer(){
        return getTextFromElement(computer);
    }
    public String verifyelectronics(){
        return getTextFromElement(electronics);
    }
    public String verifyapparels(){
        return getTextFromElement(apparel);
    }
    public String verifydigitaldownloads(){
        return getTextFromElement(digitaldownloads);
    }
    public String verifybooks(){
        return getTextFromElement(books);
    }
    public String verifyjeweler(){
        return getTextFromElement(jewelery);
    }
    public String verifygiftcard(){
        return getTextFromElement(giftcard);
    }

}
