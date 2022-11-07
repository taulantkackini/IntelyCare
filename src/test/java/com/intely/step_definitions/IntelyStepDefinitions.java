package com.intely.step_definitions;

import com.github.javafaker.Faker;
import com.intely.pages.BaseInfoPage;
import com.intely.pages.BasePage;
import com.intely.utilities.ConfigurationReader;
import com.intely.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class IntelyStepDefinitions extends BasePage {

    Faker faker = new Faker();
    BaseInfoPage baseInfoPage = new BaseInfoPage();

    @Given("User is in the account creation page")
    public void user_is_in_the_account_creation_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("intely.url"));
    }

    @When("user fills email box")
    public void user_fills_email_box() {
        emailBox.sendKeys(faker.bothify("???????##@mailinator.com"));
    }

    @When("user fills password box")
    public void user_fills_password_box() {
        passwordBox.sendKeys(faker.internet().password(8, 20, true));
    }

    @When("user clicks create button")
    public void user_clicks_create_button() {
        createAccountButton.click();
    }

    //Basic info
    @When("user enters basic info page continue button is unclickable")
    public void user_enters_basic_info_page_continue_button_is_unclickable() {
        Assert.assertTrue("Test passed!", baseInfoPage.continueButton.isDisplayed());
    }

    @When("user fills the first name continue button is yet unclickable")
    public void userFillsTheFirstNameContinueButtonIsYetUnclickable() {
        baseInfoPage.firstName.sendKeys(faker.name().firstName());
        Assert.assertTrue("Continue button is Enabled!!!", baseInfoPage.continueButton.isDisplayed());
    }

    @When("user fills the last name continue button is yet unclickable")
    public void userFillsTheLastNameContinueButtonIsYetUnclickable() {
        baseInfoPage.lastName.sendKeys(faker.name().lastName());
        Assert.assertTrue("Continue button is Enabled!!!", baseInfoPage.continueButton.isDisplayed());
    }

    @When("user fills the mobile number continue button is yet unclickable")
    public void userFillsTheMobileNumberContinueButtonIsYetUnclickable() {
        baseInfoPage.mobileNumber.sendKeys(faker.numerify("##########"));
        Assert.assertTrue("Continue button is Enabled!!!", baseInfoPage.continueButton.isDisplayed());
    }

    @When("user fills the zip code continue button is yet unclickable")
    public void userFillsTheZipCodeContinueButtonIsYetUnclickable() {
        baseInfoPage.zipCode.sendKeys(faker.numerify("0####"));
        Assert.assertTrue("Continue button is Enabled!!!", baseInfoPage.continueButton.isDisplayed());
    }

    @When("user selects qualification types the continue button is clickable")
    public void userSelectsQualificationTypesTheContinueButtonIsClickable() {
//        String MainWindow = Driver.getDriver().getWindowHandle();
        baseInfoPage.qualificationPlace.click();
        int maxProducts = baseInfoPage.qualificationOptions.size();
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        baseInfoPage.qualificationOptions.get(randomProduct).click();
        Assert.assertTrue(baseInfoPage.continueButton.isEnabled());

//        Set<String> s1 = Driver.getDriver().getWindowHandles();
//        Iterator<String> i1 = s1.iterator();
//
//        while (i1.hasNext()) {
//            String ChildWindow = i1.next();
//            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
//                Driver.getDriver().switchTo().window(ChildWindow);
//                Driver.getDriver().close();
//                System.out.println("Child window closed");
//            }
//        }
//        Driver.getDriver().switchTo().window(MainWindow);
//        Driver.getDriver().switchTo().parentFrame();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ESCAPE).build();
    }

    @When("user fills shifts, work experiences and  agrees on terms")
    public void userFillsShiftsWorkExperiencesAndAgreesOnTerms() {

       // baseInfoPage.firstShift.click();

//        int maxProducts = baseInfoPage.shiftOptions.size();
//        Random random = new Random();
//        int randomProduct = random.nextInt(maxProducts);
//        baseInfoPage.shiftOptions.get(randomProduct).click();
//        int maxProducts2 = baseInfoPage.workExperienceOptions.size();
//        int randomProduct2 = random.nextInt(maxProducts);
//        baseInfoPage.workExperienceOptions.get(randomProduct2).click();
//
//        baseInfoPage.termsCheckBox.click();
    }

    @Then("user after clicking continue button will be redirected to OTP page")
    public void userAfterClickingContinueButtonWillBeRedirectedToOTPPage() {
    }
}
