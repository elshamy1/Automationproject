package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P02_LoginPage extends PageBase{

    public P02_LoginPage(WebDriver drive) {
        super(drive);
    }
@FindBy(className = "ico-login")
WebElement clickLoginTab;
    @FindBy(id = "Email")
    WebElement Emailtxt;
    @FindBy(id = "Password")
    WebElement PasswordTxt;

    @FindBy(className = "login-button")
    WebElement login_button;



    public void ClickLogin(){
        clickButton(clickLoginTab);
    }
    public void userLogin(String email , String password) {

        setTextElement(Emailtxt, email);
        setTextElement(PasswordTxt, password);


    }

    public void ConfirmLoginData(){
        clickButton(login_button);
    }
}


