package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P05_SearchPage extends PageBase{
    public P05_SearchPage(WebDriver drive) {
        super(drive);
    }
    @FindBy (id = "small-searchterms")
    WebElement searchfil ;

    @FindBy(className = "search-box-button")
    WebElement Searchbutt;

    public void searchByName(String text){
        setTextElement(searchfil, text);
        clickButton(Searchbutt);
    }

}
