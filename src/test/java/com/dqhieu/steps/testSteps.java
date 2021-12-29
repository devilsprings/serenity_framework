package com.dqhieu.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import com.dqhieu.page.pageObject;

public class testSteps {
  @Steps
  pageObject pageObject;

  @Given("I open the survey Monkey page")
  public void iOpenTheSurveyPage() {
    pageObject.open();
  }

  @When("I choose answer {string}")
  public void iChooseTheAnswer(String answer) {
    pageObject.answerSurvey(answer);
  }

  @And("I submit my answer")
  public void iSubmitMyAnswer() {
    pageObject.submitAnswer();
  }

  @Then("I should see {string} message display")
  public void iCheckForSubmitSuccessfulMessage(String message) {
    Assert.assertEquals(pageObject.checkSubmitSuccessfulMessage(), message);
  }

  @Then("I click Prev button")
  public void iClickPrevButton() {
    pageObject.goToThePrevPage();
  }

  @And("The {string} button should be clicked")
  public void theBadButtonShouldBeClicked(String button) {
    Assert.assertEquals(pageObject.getBtnStatus(button), "true");
  }

  @And("The {string} button and {string} button should not be clicked")
  public void theButtonShouldNotBeClicked(String button1, String button2) {
    Assert.assertEquals(pageObject.getBtnStatus(button1), "false");
    Assert.assertEquals(pageObject.getBtnStatus(button2), "false");
  }
}
