package steps;

import net.serenitybdd.core.pages.PageObject;
import pageObject.SurveyPage;

public class SurveySteps extends PageObject {

  SurveyPage surveyPage;

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
}
