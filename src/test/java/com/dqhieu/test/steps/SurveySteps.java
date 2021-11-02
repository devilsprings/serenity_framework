package com.dqhieu.test.steps;

import com.dqhieu.test.pageObject.SurveyPage;
import net.serenitybdd.core.pages.PageObject;

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
