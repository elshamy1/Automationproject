package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout extends PageBase{
    public Logout(WebDriver drive) {
        super(drive);
    }

    private By statusAlert= By.className("ico-logout");
    public By getAlertText(){
        return statusAlert;


}
}
