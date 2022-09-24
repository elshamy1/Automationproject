package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.example.stepDefinition.Hooks;


public class P04_HoveringPage extends PageBase{


    public P04_HoveringPage(WebDriver drive) {
        super(drive);
    }

    @FindBy(xpath = "//parent::li//parent::ul[@class=\"top-menu notmobile\"]//a[@href=\"/computers\"]")
    WebElement parentMenu;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a")
    WebElement childMenu;


    public void hover() throws InterruptedException {

       Actions action = new Actions(Hooks.driver);
       action.moveToElement(parentMenu);
       Thread.sleep(300);
        action.moveToElement(childMenu);
        action.click().build().perform();


   }
}
