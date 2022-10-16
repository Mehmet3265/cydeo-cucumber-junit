package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _3_WikipediaPage {

    public _3_WikipediaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "searchInput")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy(xpath = "//span[@class='mw-page-title-main']")
    public WebElement mainHeader;

    @FindBy(xpath = "//th[@class='infobox-above']")
    public WebElement imgHeader;




}
