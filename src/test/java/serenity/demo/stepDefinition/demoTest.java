package serenity.demo.stepDefinition;

import org.jruby.RubyProcess;
import serenity.demo.pageObject.SurveyPageObject;
import serenity.demo.steps.SurveySteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

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

  @And("submit the answer")
  public void userSubmitTheAnswer() {
    surveySteps.submitAnswer();

  }

  @Then("I should see {string} message")
  public void userCheckReturnedMessage(String surveyMessage) {
    surveySteps.checkMessage();
    Assert.assertEquals(SurveyPageObject.message, surveyMessage);
  }

  @When("I go to previous page")
  public void userGotoPreviousPage() {
    surveySteps.goToPreviousPage();
  }

  @Then("Button {string} should be clicked")
  public void checkBtnStatusClicked(String button) {
    surveySteps.checkBtnStatus(button);
    Assert.assertEquals(SurveyPageObject.btnStatus, "true");
    System.out.println(String.format("Button %s clicked :", button) + SurveyPageObject.btnStatus);
  }

  @And("Button {string} should not be clicked")
  public void checkBtnStatus(String button) {
    surveySteps.checkBtnStatus(button);
    Assert.assertEquals(SurveyPageObject.btnStatus, "false");
    System.out.println(String.format("Button %s clicked :", button) + SurveyPageObject.btnStatus);
  }
}
