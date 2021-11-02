package com.dqhieu.steps;

import com.dqhieu.pageObject.SurveyPageObject;
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
}
