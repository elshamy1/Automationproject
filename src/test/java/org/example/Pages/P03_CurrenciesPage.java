package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class P03_CurrenciesPage extends PageBase{
    public P03_CurrenciesPage(WebDriver drive) {
        super(drive);
    }

    @FindBy(id = "customerCurrency")
    WebElement selectDrop;

    public void setSelectDrop(){
        Select selectObject = new Select(selectDrop);
        selectObject.selectByIndex(1);

    }


}
