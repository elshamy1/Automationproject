package org.example.stepDefinition;

import org.example.Pages.P09_ShoppingCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.example.stepDefinition.Hooks.driver;

public class D09_ShoppingCartStepDef {
    P09_ShoppingCartPage addingData = new P09_ShoppingCartPage(driver);
    @Given("user navigate to product")
    public void wish() throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/digital-downloads");
        Thread.sleep(1000);

    }

    @When("user click in adding product to cart")
    public void addingProduct() throws InterruptedException {
        addingData.clickCart();

        Thread.sleep(2000);
    }

    @Then("the product adding to cart successfully")
    public void SuccessAdding(){
        String expectRes= driver.findElement(addingData.getAlertText()).getText();
        Assert.assertTrue(expectRes.contains("The product has been added "));

    }
}
