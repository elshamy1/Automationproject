package org.example.stepDefinition;

import org.example.Pages.P03_CurrenciesPage;
import io.cucumber.java.en.Given;


import static org.example.stepDefinition.Hooks.driver;

public class D03_CurrenciesStepsDef {

    P03_CurrenciesPage selectop= new P03_CurrenciesPage(driver);
    @Given("user  to dropdown list and select one option")
    public void userOpenDropdown() throws InterruptedException {
        selectop.setSelectDrop();
        Thread.sleep(3000);
    }


}
