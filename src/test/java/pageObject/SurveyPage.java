package pageObject;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;

public class SurveyPage extends PageObject {
  public static String message;

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

  public String checkMessage() {
    WebElementFacade lblHaveANiceDay = $(By.xpath("//div[@role='heading']/div"));
    message = lblHaveANiceDay.waitUntilVisible().getText();
    return message;
  }
}
