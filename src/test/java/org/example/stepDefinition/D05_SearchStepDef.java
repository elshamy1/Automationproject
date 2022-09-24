package org.example.stepDefinition;

import org.example.Pages.P05_SearchPage;
import io.cucumber.java.en.Given;

import static org.example.stepDefinition.Hooks.driver;

public class D05_SearchStepDef {
    P05_SearchPage searchName = new P05_SearchPage(driver);

    @Given("user can search in product")
    public void userSearch(){
        searchName.searchByName("apple");
    }
}
