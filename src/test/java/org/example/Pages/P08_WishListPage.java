package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;


public class P08_WishListPage extends PageBase{
    public P08_WishListPage(WebDriver drive) {
        super(drive);
    }

    @FindBy( xpath ="//div[@class =\"product-grid home-page-product-grid\"]")
    WebElement section;

    List<WebElement> links = section.findElements(By.className("add-to-wishlist-button"));

    @FindBy(id = "add-to-wishlist-button-4")
    WebElement addingButt;


    private By statusAlert= By.className("content");
    public void checkdata() {

        for(int i=0 ; i< links.size() ; i++ ) {
        }
        clickButton(links.get(1));
    }

    public void confirmAdding(){

        clickButton(addingButt);
    }

    public By getAlertText(){
        return statusAlert;
    }


}
