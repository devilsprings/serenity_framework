package serenity.demo.steps;

import serenity.demo.pageObject.SurveyPageObject;
import net.serenitybdd.core.pages.PageObject;

public class SurveySteps extends PageObject {

  SurveyPageObject surveyPage;

  public void selectAnswer(String answer) {
    surveyPage.answerSurvey(answer);
  }

  public void submitAnswer() {
    surveyPage.submitAnswer();
  }

  public void checkMessage() {
    surveyPage.checkMessage();
  }

  public void openWebPage() {
    surveyPage.open();
  }

  public void goToPreviousPage() {
    surveyPage.goToPreviousPage();
  }

  public void checkBtnStatus(String answer) {
    surveyPage.verifyBtnStatus(answer);
  }
}
