package com.serenityDemo.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import com.serenityDemo.pageObject.PageObjectModel;
import com.serenityDemo.steps.DemoTestSteps;

public class DemoTest {
  @Steps
  DemoTestSteps demoTestSteps;

  @Given("I go to survey page")
  public void userGotoSurveyPage() {
    demoTestSteps.openWebPage();
  }

  @When("I select Good")
  public void userChooseTheAnswer() {
    demoTestSteps.selectAnswer();
  }

  @And("I submit the answer")
  public void userSubmitTheAnswer() {
    demoTestSteps.submitAnswer();
  }

  @Then("I should see \"Have a nice day.\" message")
  public void userCheckReturnedMessage() {
    demoTestSteps.checkMessage();
    Assert.assertEquals(PageObjectModel.message, "Have a nice day.");
  }
}
