package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _1_GoogleSearchPage {

    //create constructor
    //initialize the driver instance and this class' instance using PageFactory.intElements
    public _1_GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //We can start locating webElements using @FindBy anotation
    @FindBy (name =  "q")
    public WebElement searchBox;
}
