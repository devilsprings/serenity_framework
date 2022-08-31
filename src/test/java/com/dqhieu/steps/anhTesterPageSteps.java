package com.dqhieu.steps;

import com.dqhieu.page.commonElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Assert;

public class anhTesterPageSteps extends PageObject {
  private static final EnvironmentVariables environmentVariables =
          SystemEnvironmentVariables.createEnvironmentVariables();
  private static final String URL =
          EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("url");
  String a;
  String b;

  commonElements common;

  @Given("I access Anh tester website")
  public void iAccessAnhTesterWebsite() {
    openUrl(URL);
    //common.closeAdsPopup();
  }

  @And("I click on sidebar menu Input Forms")
  public void iClickOnSidebarMenuInputForms() {
      common.clickInputForm();
  }

  @And("Select simple form demo")
  public void selectSimpleFormDemo() throws Throwable {
    common.clickSimpleForm();

  }
  @And("Close popup")
  public void closePopup() {
    common.closeAdsPopup();

  }
  @And("Input generate random two letters two numbers and current date into message field")
  public void inputGenerateRandomTwoLettersTwoNumbersAndCurrentDateIntoMessageField() throws Throwable {
    common.enterYourMessage();

  }

  @And("Click show message")
  public void clickShowMessage() {
    common.showMessage();
  }

  @Then("Verify message display correct mapping with input data")
  public void verifyMessageDisplayCorrectMappingWithInputData() {
    common.verifyMessage();

  }

  @Then("Enter number {string} into enter a field")
  public void enterNumberAInEnterAField(String numberA) {
    this.a = numberA;
    common.enterFirstValue(numberA);
  }

  @And("Enter number {string} into enter b field")
  public void enterNumberBInEnterBField(String numberB) {
    this.b = numberB;
    common.enterSecondValue(numberB);
  }

  @And("Click get total")
  public void clickGetTotal() {
    common.getTotal();
  }

  @Then("Verify total a+b is correct")
  public void verifyTotalABIsCorrect() {
    Assert.assertEquals(Float.parseFloat(common.getTotalValue()), Float.parseFloat(a) + Float.parseFloat(b), 0.0);
  }


  @Then("Enter number a {string} and Enter number b {string}")
  public void enterNumberAAndEnterNumberB(String numA, String numB) {
    this.a = numA;
    this.b = numB;
    common.enterFirstValue(numA);
    common.enterSecondValue(numB);
  }

  @And("Select Input form submit")
  public void selectInputFormSubmit() {
    common.clickInputFormSubmit();
  }


  @Then("Enter email {string}")
  public void enterEmail(String email) throws Throwable {
    common.enterEmail(email);
  }

  @Then("Verify email no longer error")
  public void verifyEmailNoLongerError() {
    common.verifyEmailError();
  }

  @And("Enter phone number {string}")
  public void enterPhoneNumber(String phoneNumb) throws Throwable {
    common.enterPhone(phoneNumb);
  }

  @Then("Enter {string} into Project Description")
  public void enterIntoProjectDescription(String letter) {
    common.enterProjectDescription(letter);
  }

  @Then("Verify Project Description no longer error")
  public void verifyProjectDescriptionNoLongerError() throws Throwable {
    common.verifyProjectDescription();
  }
}
