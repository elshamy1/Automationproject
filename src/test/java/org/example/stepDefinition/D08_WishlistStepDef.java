package org.example.stepDefinition;

import org.example.Pages.P08_WishListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.example.stepDefinition.Hooks.driver;

public class D08_WishlistStepDef
{
    P08_WishListPage test = new P08_WishListPage(driver);
    @Given("user click to wishlist to view detailed")
    public void wish() throws InterruptedException {
        test.checkdata();
        Thread.sleep(3000);

    }

    @When("user click in adding button")
    public void addingProduct() throws InterruptedException {
        test.confirmAdding();
        Thread.sleep(2000);
    }

    @Then("the product adding successfully")
    public void SuccessAdding(){
        String expectRes= driver.findElement(test.getAlertText()).getText();
        Assert.assertTrue(expectRes.contains("The product has been added  "));
    }

}
