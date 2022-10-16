package com.cydeo.step_definitions;

import com.cydeo.pages._6_2_ViewAllOrderPage;
import com.cydeo.pages._6_BasePage_OrderPage;
import com.cydeo.pages._5_WebTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class _6_WebTableOrder_StepDefination {

    _5_WebTablePage webTablePage = new _5_WebTablePage();
    _6_BasePage_OrderPage baseOrderPage = new _6_BasePage_OrderPage();

    _6_2_ViewAllOrderPage viewAllOrderPage =new _6_2_ViewAllOrderPage();
    @Given("user is allready logged in and on order page")
    public void user_is_allready_logged_in_and_on_order_page() {
        //Getting the page using the properties rl
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        //Calling our login method to log in to web table app
        webTablePage.login();

        //clicking to "order" link to go order page
        baseOrderPage.order.click();

    }
    @When("user selects product type {string}")
    public void user_selects_product_type_familybea(String string) {
        Select select =new Select(baseOrderPage.productDropdown);
        select.selectByVisibleText(string);
    }
    @Then("user enters appropriate test data")
    public void user_enters_appropriate_test_data() {

    }

    @And("user enters quantity {int}")
    public void userEntersQuantity(int arg0) {
        //accept int argument and sending it using sendKeys( method
        //since sendKeys() method only accepts String, we need to either concat with""
        //or use Strin.valuOf(argument)

        //baseOrderPage.inputQuntity.sendKeys(arg0+"");
        //baseOrderPage.inputQuntity.click();

        //Keys.BACK_SPACE  CLEARS EVERYTHING
        baseOrderPage.inputQuntity.sendKeys(Keys.BACK_SPACE);
        baseOrderPage.inputQuntity.sendKeys(String.valueOf(arg0));


    }

    @Then("user enters costumer name {string}")
    public void user_enters_costumer_name(String string) {
        baseOrderPage.inputName.sendKeys(string);
    }
    @Then("user enters street {string}")
    public void user_enters_street_221b_baker_street(String string) {
        baseOrderPage.inputStreet.sendKeys(string);
    }

    @Then("user enters city {string}")
    public void user_enters_city(String string) {
        baseOrderPage.inputCity.sendKeys(string);
    }
    @Then("user enters state {string}")
    public void user_enters_state(String string) {
       baseOrderPage.inputState.sendKeys(string);
    }
    @Then("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
       baseOrderPage.inputZip.sendKeys(string);
    }
    @Then("user selects credit card type {string}")
    public void user_selects_credit_card_type(String expectedCardType) {

        //This line will loop through the list and decide which radio button to click
        BrowserUtils.clickRadioButton(baseOrderPage.cardType,expectedCardType);
    }
    @Then("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        baseOrderPage.cardnoInput.sendKeys(string);
    }
    @Then("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        baseOrderPage.expiredDate.sendKeys(string);
    }
    @Then("user enters process order button")
    public void user_enters_process_order_button() {
        baseOrderPage.processButton.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedName) {

        String actualName= viewAllOrderPage.newcustomerCell.getText();

        Assert.assertEquals(expectedName,actualName);
    }


}
