package com.cydeo.pages;

/*
In this class we will store WebElements common to all pages
 */

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _6_BasePage_OrderPage {
    public _6_BasePage_OrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='View all orders']")
    public WebElement viewAllOrders;

    @FindBy(xpath = "//button[.='View all products']")
    public WebElement getViewAllProducts;

    @FindBy(xpath = "//button[.='Order']")
    public WebElement order;

    @FindBy(xpath = "//button[.='Logout']")
    public WebElement LogoutButton;





    @FindBy(name = "product")
    public WebElement productDropdown;

    @FindBy(name = "quantity")
    public WebElement inputQuntity;

    @FindBy(name = "name")
    public WebElement inputName;

    @FindBy(name ="street" )
    public WebElement inputStreet;

    @FindBy(name = "city")
    public WebElement inputCity;

    @FindBy(name ="state" )
    public WebElement inputState;

    @FindBy(name = "zip" )
    public WebElement inputZip;

    @FindBy(name = "card")
    public List<WebElement> cardType;


    @FindBy(name = "cardNo")
    public WebElement cardnoInput;

    @FindBy(name = "cardExp")
    public WebElement expiredDate;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processButton;



}
