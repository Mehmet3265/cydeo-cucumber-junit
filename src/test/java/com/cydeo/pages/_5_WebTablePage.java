package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class _5_WebTablePage {
    public _5_WebTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(name = "username")
    public WebElement usernameBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;


    /**
     * No Parameters
     * when we call this method we will login directly using this
     *
     * username : Test
     * password :Tester
     */
    public void login(){
        this.usernameBox.sendKeys("Test");
        this.passwordBox.sendKeys("Tester");
        this.loginButton.click();
    }

    /**
     * This method will accept two argument and login
     *
     * @param username
     * @param password
     */
    public void login(String username,String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }

    public void loginWithConfiguration(){
        this.usernameBox.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        this.passwordBox.sendKeys(ConfigurationReader.getProperty("web.table.pw"));
        this.loginButton.click();
    }



}
