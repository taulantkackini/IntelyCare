package com.intely.pages;

import com.intely.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"input_0\"]")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id=\"input_1\"]")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id=\"AP_FirstPage_CreateAccount\"]")
    public WebElement createAccountButton;
}
