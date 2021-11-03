package serenity.demo.stepDefinition;

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

  @When("I select Good")
  public void userChooseTheAnswer() {
    surveySteps.selectAnswer();
  }

  @And("submit the answer")
  public void userSubmitTheAnswer() {
    surveySteps.submitAnswer();

  }
  @Then("I should see Have a nice day message")
  public void userCheckReturnedMessage() {
    surveySteps.checkMessage();
    Assert.assertEquals(SurveyPageObject.message, "Have a nice day.");
  }
}
