package org.example.stepDefinition;

import org.example.Pages.P07_FollowUsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.example.stepDefinition.Hooks.driver;

public class D07_FollowUsStepDef {

    P07_FollowUsPage follow=new P07_FollowUsPage(driver);

    @Given("user navigate to follow us icons")
    public void navigate_section() throws InterruptedException {
        follow.naugation();
        Thread.sleep(3000);

    }
    @When("user click in facebook icon")
    public void clickFB(){
        follow.clickFbAction();
    }
    @Then("the facebook top open in new page")
    public void newFbTab(){
        Assert.assertEquals(follow.confirmOpen(),"https://www.facebook.com/nopCommerce");
    }

    @When("user click in twitter icon")
    public void clickTwitter(){
        follow.clickTwitAction();
    }
    @Then("the twitter top open in new page")
    public void newTwitTab(){
        Assert.assertEquals(follow.confirmOpen(),"https://twitter.com/nopCommerce");
    }

    @When("user click in rss icon")
    public void clickRss(){
        follow.clickRssAction();
    }
    @Then("the rss top open in new page")
    public void newRssTab(){
        Assert.assertEquals(follow.confirmRssOpen(),"https://demo.nopcommerce.com/news/rss/1");
    }

    @When("user click in youtube icon")
    public void clickYoyTube(){
        follow.clickYtubeAction();
    }
    @Then("the youtube top open in new page")
    public void newYtubrTab(){
        Assert.assertEquals(follow.confirmOpen(),"https://www.youtube.com/user/nopCommerce");
    }
}
