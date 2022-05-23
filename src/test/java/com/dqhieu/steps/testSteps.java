package com.dqhieu.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import com.dqhieu.page.pageObject;

public class testSteps {
  @Steps pageObject pageObject;

  @Given("I go to mobile menu")
  public void iGoToMobileMenu() {
    pageObject.open();
    pageObject.goToMobileMenu();
  }

  @And("I go to Mobile Rate Plans menu")
  public void iGoToMobileRatePlansMenu() {
    pageObject.goToMobileRatePlan();
  }

  @When("I select Rs600 plan")
  public void iSelectRs600Plan() {
    pageObject.clickGetRs600Plan();
  }

  @Then("I select Foreigner at Identity Verification screen")
  public void iSelectForeignerAtIdentityVerificationScreen() {
    pageObject.selectForeignerIdentityVerificationScr();
  }

  @And("I enter passport number as {string}")
  public void iEnterPassportNumberAs(String passportNumber) {
    pageObject.inputPassportNumber(passportNumber);
  }

  @And("I click continue button")
  public void iClickContinueButton() {
    pageObject.clickContinueButton();
  }

  @And("I enter mobile number as {string}")
  public void iEnterMobileNumberAs(String mobileNumber) {
    pageObject.inputMobileNumber(mobileNumber);
  }

  @Then("I should be able to see OTP Verification popup")
  public void iShouldBeAbleToSeeOTPVerificationPopup() {
    Assert.assertTrue(pageObject.checkOTPPopUpVisibility());
  }
}
