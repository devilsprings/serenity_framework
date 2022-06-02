package com.thtung.steps;

import com.thtung.page.registrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.Assert;

public class registrationStepsTest extends PageObject {
  private static final EnvironmentVariables environmentVariables =
      SystemEnvironmentVariables.createEnvironmentVariables();
  private static final String URL =
      EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("url");
  registrationPage registrationPage;

  @Given("user go to Bursa Marketplace page")
  public void userRegistrationTest() {
    openUrl(URL);
  }

  @And("user click on registration menu")
  public void userClickOnRegistrationMenu() {
    registrationPage.clickRegisterButton();
  }

  @When("user enter {string}, {string} and {string}")
  public void userEnterDisplayNameEmailAndPassword(String name, String email, String password) {
    registrationPage.inputUserInformation(name, email, password);
  }

  @And("user click submit button without fill the CAPTCHA")
  public void userClickSubmitButtonWithoutFillTheCAPTCHA() {
    registrationPage.clickSignUpButton();
  }

  @Then("user will see error message {string}")
  public void userWillSeeErrorMessage(String errorMessage) {
    Assert.assertTrue(registrationPage.verifyErrorMessageDisplay(errorMessage));
  }
}
