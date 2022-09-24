package org.example.stepDefinition;

import org.example.Pages.P04_HoveringPage;
import io.cucumber.java.en.Given;

import static org.example.stepDefinition.Hooks.driver;

public class D04_HoveringCategoryStepDef {
    P04_HoveringPage hoverCategory = new P04_HoveringPage(driver);

    @Given("user hover in category")

    public void hovwetest() throws InterruptedException {
        hoverCategory.hover();

    }
}

