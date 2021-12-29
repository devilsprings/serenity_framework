package com.dqhieu.page;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class pageObject extends PageObject {


  public void answerSurvey(String answer) {
    WebElementFacade btnAnswer =
        $(
            By.xpath(
                String.format(
                    "//span[contains(@class, 'radio-button-label') and contains(text(), '%s')]",
                    answer)));
    btnAnswer.waitUntilVisible().click();
  }

  public void submitAnswer() {
    WebElementFacade btnNext = $(By.xpath("//button[@type='submit']"));
    btnNext.click();
  }

  public String checkSubmitSuccessfulMessage() {
    WebElementFacade lblHaveANiceDay = $(By.xpath("//div[@role='heading']/div"));
    System.out.println(lblHaveANiceDay.waitUntilVisible().getText());
    return lblHaveANiceDay.waitUntilVisible().getText();
  }

  public void goToThePrevPage() {
    WebElementFacade btnPrev = $(By.xpath("//button[contains(text(), 'Prev')]"));
    btnPrev.click();
  }

  public String getBtnStatus(String button) {
    WebElementFacade btnStatus =
        $(
            By.xpath(
                String.format("//span[contains(text(), '%s')]/../preceding-sibling::input", button)));
    return btnStatus.getAttribute("aria-checked");
  }
}
