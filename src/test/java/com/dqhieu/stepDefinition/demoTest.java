package com.dqhieu.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import com.dqhieu.pageObject.SurveyPageObject;
import com.dqhieu.steps.SurveySteps;

public class demoTest {
  @Steps SurveySteps surveySteps;

  @Given("I go to survey page")
  public void userGotoSurveyPage() {
    surveySteps.openWebPage();
  }

  @When("I select {string}")
  public void userChooseTheAnswer(String answer) {
    surveySteps.selectAnswer(answer);
  }

  @And("I submit the answer")
  public void userSubmitTheAnswer() {
    surveySteps.submitAnswer();
  }

  @Then("I should see {string} message")
  public void userCheckReturnedMessage(String message) {
    surveySteps.checkMessage();
    Assert.assertEquals(SurveyPageObject.message, message);
  }
}
