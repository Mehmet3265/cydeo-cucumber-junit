package com.cydeo.step_definitions;

import com.cydeo.pages._1_GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class _1_Gogle_Step_Definitions {

    _1_GoogleSearchPage googleSearchPage=new _1_GoogleSearchPage();



    @When("user types apple and clicks enter")
    public void user_types_and_clicks_enter2() {

        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

    }
    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searchKeyword) {

       googleSearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);

    }
    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {

    }
    @Then("user sees apple in the google title")
    public void userSeesAppleInTheGoogleTitle() {
        String expectedTitle=  "apple - Google'da Ara";
        String actualTitle= Driver.getDriver().getTitle();

        //Junit assertion accepts Firstly expected argument and secondly actual argument
        Assert.assertEquals("Title is not as axpected",expectedTitle,actualTitle);


        //Assert.assertTrue(("apple").equals(_3_Driver.getDriver().getTitle()));

    }
    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        // Write code here that turns the phrase above into concrete actions
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

        Driver.closeDriver();
    }

}
