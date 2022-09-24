package org.example.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P06_HomeSliderPage extends PageBase{


    public P06_HomeSliderPage(WebDriver drive) {
        super(drive);
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]")
    WebElement firstSlid;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]")
    WebElement secSlid;

    public void setFirstSlid(){
        clickButton(firstSlid);
    }
    public void setSecSlid(){
        clickButton(secSlid);
    }


}

