package com.thtung.steps;

import com.thtung.page.registrationPage;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "data/data.csv")
@Concurrent(threads="4")
public class registrationStepsTest extends PageObject {
  private static final EnvironmentVariables environmentVariables =
      SystemEnvironmentVariables.createEnvironmentVariables();
  private static final String URL =
      EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("url");
  private String name;
  private String email;
  private String password;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Qualifier
  public String getQualifier() {
    return name + "=>" + email + "=>" + password;
  }

  @Steps registrationPage registrationPage;

  @Test
  @Title("User Registration Test")
  public void userRegistrationTest() {
    openUrl(URL);
    registrationPage.clickRegisterButton();
    registrationPage.inputUserInformation(name, email, password);
    registrationPage.clickSignUpButton();
    Assert.assertTrue(registrationPage.verifyErrorMessageDisplay("Captcha fields are mandatory"));
  }
}
