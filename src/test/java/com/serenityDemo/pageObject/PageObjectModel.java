package com.serenityDemo.pageObject;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PageObjectModel extends PageObject {
  public static String message;

  public void answerGoodBtn() {
    WebElementFacade btnAnswer =
        $(
            By.xpath(
                    "//span[contains(@class, 'radio-button-label') and contains(text(), 'Good')]"));
    btnAnswer.waitUntilVisible().click();
  }

  public void submitAnswer() {
    WebElementFacade btnNext = $(By.xpath("//button[@type='submit']"));
    btnNext.click();
  }

  public String checkMessage() {
    WebElementFacade lblHaveANiceDay = $(By.xpath("//div[@role='heading']/div"));
    message = lblHaveANiceDay.waitUntilVisible().getText();
    return message;
  }
}
