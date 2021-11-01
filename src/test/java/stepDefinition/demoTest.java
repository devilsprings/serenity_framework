package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pageObject.SurveyPage;
import steps.SurveySteps;

public class demoTest {
  @Steps
  SurveySteps surveySteps;

  @Given("User go to surveymonkey page")
  public void userGotoSurveyPage() {
    surveySteps.openWebPage();
  }

  @Then("User select {string} and submit the answer")
  public void userChooseTheAnswer(String answer) {
    surveySteps.selectAnswer(answer);
    surveySteps.submitAnswer();
  }

  @Then("User should see \"Have a nice day.\" message")
  public void userCheckReturnedMessage() throws Throwable {
    surveySteps.checkMessage();
    Assert.assertEquals(SurveyPage.message, "Have a nice day.");
  }
}
