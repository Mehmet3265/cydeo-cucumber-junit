package com.cydeo.step_definitions;

import com.cydeo.pages._4_DropDownsPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class _4_DataTable_Definations {
    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {
        System.out.println(fruits);
        System.out.println(fruits.get(1));
    }

    _4_DropDownsPage dropDownsPage=new _4_DropDownsPage();

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String>expectedOptions) {


        List<String> actualOptionsString= BrowserUtils.dropDownOptionsAsString(dropDownsPage.monthDropDown);

        Assert.assertTrue(expectedOptions.equals(actualOptionsString));
        //Assert will check the size first if it is correct then will check them one by one

    }


}
