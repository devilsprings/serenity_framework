package serenity.demo.pageObject;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SurveyPageObject extends PageObject {
  public static String message;

  public void answerSurvey() {
    WebElementFacade btnAnswer =
        $(By.xpath("//span[contains(text(), 'Good')]"));
    btnAnswer.waitUntilVisible().click();
  }

  public void submitAnswer() {
    WebElementFacade btnNext = $(By.xpath("//button[@type='submit']"));
    btnNext.click();
  }

  public String checkMessage() {
    WebElementFacade lblHaveANiceDay = $(By.xpath("//div[@role='heading']/div"));
    return message = lblHaveANiceDay.waitUntilVisible().getText();
  }
}
