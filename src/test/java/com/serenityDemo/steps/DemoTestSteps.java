package com.serenityDemo.steps;

import com.serenityDemo.pageObject.PageObjectModel;
import net.serenitybdd.core.pages.PageObject;

public class DemoTestSteps extends PageObject {

  PageObjectModel surveyPageObject;

  public void selectAnswer() {
    surveyPageObject.answerGoodBtn();
  }

  public void submitAnswer() {
    surveyPageObject.submitAnswer();
  }

  public void checkMessage() {
    surveyPageObject.checkMessage();
  }

  public void openWebPage() {
    surveyPageObject.open();
  }
}
