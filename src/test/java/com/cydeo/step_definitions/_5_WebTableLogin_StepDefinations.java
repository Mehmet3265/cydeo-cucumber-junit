package com.cydeo.step_definitions;

import com.cydeo.pages._5_WebTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class _5_WebTableLogin_StepDefinations {
    _5_WebTablePage webTablePage = new _5_WebTablePage();
    @Given("user is on the login page of webTable app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webTablePage.usernameBox.sendKeys(string);

    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTablePage.passwordBox.sendKeys(string);
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTablePage.loginButton.click();
    }

    @Then("user should see URL contains order")
    public void user_should_see_url_contains_order() {
        BrowserUtils.verifyUrlContains("order");
    }
    @When("user enters username {string}  password {string} and logins")
    public void user_enters_username_password_and_logins(String username, String pw) {
        webTablePage.login(username,pw);
    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {
//        webTablePage.usernameBox.sendKeys(credentials.get("username"));
//        webTablePage.passwordBox.sendKeys(credentials.get("password"));
//        webTablePage.loginButton.click();

        //we can call our login utility method and pass values from map
        webTablePage.login(credentials.get("username"), credentials.get("password"));

    }



}

