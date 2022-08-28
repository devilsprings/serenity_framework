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
    common.closeAdsPopup();
  }

  @Given("I click on sidebar menu {string}")
  public void iClickOnSidebarMenu(String menu) {
    common.clickOnSidebarMenu(menu);
  }
}
