package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P09_ShoppingCartPage extends PageBase{
    public P09_ShoppingCartPage(WebDriver drive) {
        super(drive);
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]")
    WebElement cartBut;


    private By statusAlert= By.id("bar-notification");

    public void clickCart(){
        clickButton(cartBut);
    }
    public By getAlertText(){
        return statusAlert;
    }
}



