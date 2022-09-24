package org.example.stepDefinition;

import org.example.Pages.P01_RegisterPage;
import org.example.Pages.data;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.example.stepDefinition.Hooks.driver;


public class D01_RegisterStepDef {



    P01_RegisterPage regist= new P01_RegisterPage(driver);
    data registerData= new data();
    @Given("user open register page")
    public void userOpenRegisterPage() throws InterruptedException {
regist.clickRegister();
        Thread.sleep(3000);

    }
    @When("user enter all data")
    public void AddRegisterData() throws InterruptedException {


        regist.userRegistration(registerData.FirstName, registerData.SecondName
                ,registerData.CompanyName,registerData.Email
                ,registerData.Password);

        regist.setSelectDrop(registerData.DayDOB,registerData.MonthDOB
                ,registerData.YearDOB);

        Thread.sleep(1000);

    }

    @And("user click in register button")
    public void CLickButton() throws InterruptedException {
        regist.ConfirmRegisterData();

        Thread.sleep(3000);
    }

    @Then("user could register successfully")
    public void SuccessRegistered(){
        String expectRes= driver.findElement(regist.getAlertText()).getText();
        Assert.assertEquals(expectRes.contains("Your registration completed"), true);
    }


}
