package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.example.stepDefinition.Hooks;
import java.util.ArrayList;

import static org.example.stepDefinition.Hooks.driver;

public class P07_FollowUsPage extends PageBase{
    public P07_FollowUsPage(WebDriver drive) {
        super(drive);
    }
@FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/div/strong")
    WebElement navigSec;
    @FindBy(xpath = "//a[@href=\"http://www.facebook.com/nopCommerce\"]")
    WebElement fbIcon;
    @FindBy(xpath = "//a[@href=\"https://twitter.com/nopCommerce\"]")
    WebElement twitIcon;
    @FindBy(xpath = "//a[@href=\"/news/rss/1\"]")
    WebElement rssIcon;
    @FindBy(xpath = "//a[@href=\"http://www.youtube.com/user/nopCommerce\"]")
    WebElement ytubeIcon;




    Actions action = new Actions(Hooks.driver);

    public void naugation(){
        action.moveToElement(navigSec);
    }

    public void clickFbAction() {
        action.moveToElement(fbIcon);
        action.click().build().perform();
    }

    public String confirmOpen(){
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        return driver.getCurrentUrl();
    }
    public String confirmRssOpen(){
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        return driver.getCurrentUrl();
    }

    public void clickTwitAction() {
        action.moveToElement(twitIcon);
        action.click().build().perform();
    }

    public void clickRssAction() {
        action.moveToElement(rssIcon);
        action.click().build().perform();
    }

    public void clickYtubeAction() {
        action.moveToElement(ytubeIcon);
        action.click().build().perform();
    }

}
