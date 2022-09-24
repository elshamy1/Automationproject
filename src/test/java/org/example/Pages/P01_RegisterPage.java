package org.example.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class P01_RegisterPage extends PageBase{


    public P01_RegisterPage(WebDriver drive) {
        super(drive);
    }

    @FindBy(id = "gender-male")
    WebElement genderIcon;

    @FindBy(xpath = "//select[@name =\"DateOfBirthDay\"]")
    WebElement dayDOB;
    @FindBy(xpath = "//select[@name =\"DateOfBirthMonth\"]")
    WebElement monthDOB;
    @FindBy(xpath = "//select[@name =\"DateOfBirthYear\"]")
    WebElement yearDOB;

    @FindBy(className = "ico-register")
    WebElement clickRegisterTab;
    @FindBy(id = "FirstName")
    WebElement FirstNameTxt;
    @FindBy(id = "LastName")
    WebElement LastnameTxt;
    @FindBy(id = "Email")
    WebElement Emailtxt;
    @FindBy(id = "Company")
    WebElement comNam;

    @FindBy(id = "Password")
    WebElement PasswordTxt;
    @FindBy(id = "ConfirmPassword")
    WebElement ConfirmPasswordTxt;
    @FindBy(id = "register-button")
    WebElement register_button;
    private By statusAlert= By.className("result");

    public void clickRegister(){
        clickButton(clickRegisterTab);
    }

    public void userRegistration(String FirstName ,String LastName ,String comName ,String email , String password) {

        clickButton(genderIcon);
        setTextElement(FirstNameTxt,FirstName);
        setTextElement(LastnameTxt,LastName);
        setTextElement(Emailtxt,email);
        setTextElement(comNam,comName);
        setTextElement(PasswordTxt,password);
        setTextElement(ConfirmPasswordTxt,password);


    }

    public void setSelectDrop(String day, String month, String year){
        Select selectDay = new Select(dayDOB);
        selectDay.selectByValue(day);

        Select selectMonth = new Select(monthDOB);
        selectMonth.selectByValue(month);

        Select selectYear = new Select(yearDOB);
        selectYear.selectByValue(year);

    }

    public void ConfirmRegisterData(){
        clickButton(register_button);
    }

    public By getAlertText(){
        return statusAlert;
    }
}
