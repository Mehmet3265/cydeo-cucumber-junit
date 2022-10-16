package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _6_2_ViewAllOrderPage extends _6_BasePage_OrderPage{
    public _6_2_ViewAllOrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(xpath = " //table[@class='table is-fullwidth']//tbody//tr[1]/td[1]")
    public WebElement newcustomerCell;


}
