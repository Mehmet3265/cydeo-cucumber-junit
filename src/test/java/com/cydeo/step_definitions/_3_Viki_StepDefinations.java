package com.cydeo.step_definitions;

import com.cydeo.pages._3_WikipediaPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class _3_Viki_StepDefinations {

    _3_WikipediaPage wikipediaPage=new _3_WikipediaPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }
    @When("User types {string} in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box(String string) {
        wikipediaPage.searchBox.sendKeys(string);
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaPage.searchButton.click();
    }
    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(string));
    }

    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String string) {
       Assert.assertTrue(wikipediaPage.mainHeader.isDisplayed());
    }



}
