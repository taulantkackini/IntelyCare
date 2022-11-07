package com.intely.pages;

import com.intely.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;
import java.util.List;

public class BaseInfoPage {

    public BaseInfoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"input_3\"]")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id=\"input_4\"]")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id=\"input_5\"]")
    public WebElement mobileNumber;

    @FindBy(xpath = "//*[@id=\"input_6\"]")
    public WebElement zipCode;

    @FindBy(xpath = "//*[@id=\"select_8\"]")
    public WebElement qualificationPlace;

    @FindBy(xpath = "//*[@id=\"select_container_9\"]/md-select-menu/md-content/md-optgroup")
    public List <WebElement> qualificationOptions;

    @FindBy(xpath = "/html/body/div[1]/div/div/form/div[2]/div[4]/div[7]/md-input-container/div")
    public List <WebElement> shiftOptions;

    @FindBy(xpath = "/html/body/div[1]/div/div/form/div[2]/div[4]/div[8]/md-input-container/md-radio-group")
    public List <WebElement> workExperienceOptions;

    @FindBy(xpath = "/html/body/div[1]/div/div/form/div[2]/div[4]/div[9]/md-input-container/md-checkbox/div[1]")
    public WebElement termsCheckBox;

    @FindBy(xpath = "/html/body/div[1]/div/div/form/div[2]")
    public WebElement extraElement;

    @FindBy (xpath = "/html/body/div[1]/div/div/form/div[2]/div[4]/div[7]/md-input-container/div/md-checkbox[5]")
    public WebElement firstShift;

}
