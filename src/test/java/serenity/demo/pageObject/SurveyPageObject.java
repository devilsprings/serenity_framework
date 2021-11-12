package serenity.demo.pageObject;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SurveyPageObject extends PageObject {
  public static String message;
  public static String btnStatus;

  public void answerSurvey(String answer) {
    WebElementFacade btnAnswer =
        $(By.xpath(String.format("//span[contains(text(), '%s')]", answer)));
    btnAnswer.waitUntilVisible().click();
  }

  public void submitAnswer() {
    WebElementFacade btnNext = $(By.xpath("//button[contains(@class, 'next-button')]"));
    btnNext.click();
  }

  public String checkMessage() {
    WebElementFacade lblHaveANiceDay = $(By.xpath("//div[@role='heading']/div"));
    return message = lblHaveANiceDay.waitUntilVisible().getText();
  }

  public String verifyBtnStatus(String answer) {
    WebElementFacade radioButton =
        $(
            By.xpath(
                String.format(
                    "//span[contains(text(), '%s')]/parent::label/preceding-sibling::input",
                    answer)));
    btnStatus = radioButton.getAttribute("aria-checked");
    return btnStatus;
  }

  public void goToPreviousPage() {
    WebElementFacade btnPrev = $(By.xpath("//button[contains(@class, 'prev-button')]"));
    btnPrev.click();
  }
}
