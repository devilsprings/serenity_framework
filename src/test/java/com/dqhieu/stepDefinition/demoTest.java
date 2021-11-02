package com.dqhieu.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import com.dqhieu.pageObject.SurveyPageObject;
import com.dqhieu.steps.SurveySteps;

public class demoTest {
  @Steps SurveySteps surveySteps;

  @Given("User go to survey page")
  public void userGotoSurveyPage() {
    surveySteps.openWebPage();
  }

  @When("User select Good and submit the answer")
  public void userChooseTheAnswer() {
    surveySteps.selectAnswer();
    surveySteps.submitAnswer();
  }

  @Then("User should see Have a nice day message")
  public void userCheckReturnedMessage() {
    surveySteps.checkMessage();
    Assert.assertEquals(SurveyPageObject.message, "Have a nice day.");
  }
}
