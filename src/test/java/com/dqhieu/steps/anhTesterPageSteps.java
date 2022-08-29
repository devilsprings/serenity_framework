package com.dqhieu.steps;

import com.dqhieu.page.commonElements;
import com.dqhieu.page.inputForm.simpleFormDemo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Assert;
import java.util.concurrent.ThreadLocalRandom;

public class anhTesterPageSteps extends PageObject {
  private static final EnvironmentVariables environmentVariables =
          SystemEnvironmentVariables.createEnvironmentVariables();
  private static final String URL =
          EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("url");

  simpleFormDemo simpleForm;
  commonElements common;

  @Given("I access Anh tester website")
  public void iAccessAnhTesterWebsite() {
    openUrl(URL);
    //common.closeAdsPopup();
  }



//  @Given("I click on sidebar menu {string}")
//  public void iClickOnSidebarMenu(String menu) {
//    common.clickOnSidebarMenu(menu);
//  }
  @And("I click on sidebar menu Input Forms")
  public void iClickOnSidebarMenuInputForms() {
      common.clickInputForm();
  }

  @And("Select simple form demo")
  public void selectSimpleFormDemo() throws Throwable {
    common.clickSimpleForm();

  }
  @And("Close popup")
  public void closePopup() throws Throwable {
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

  @Then("Enter number “a” in “enter a” field {string}")
  public void enterNumberAInEnterAField(String a) {
    common.EnterA(a);
  }

  @And("Enter number “b” in “enter b” field {string}")
  public void enterNumberBInEnterBField(String b) {
    common.EnterB(b);
  }

  @And("Click get total")
  public void clickGetTotal() {
    common.getTotal();
  }

  @Then("Verify total a+b is correct")
  public void verifyTotalABIsCorrect() {
    common.verifyTotal();
  }

}
