package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class LoginPageSteps extends PageObject {

  pageObject.LoginPage loginPage;

  @Step("Verify web title")
  public void verifyTitle() {
    loginPage.verifyTitle();
  }

  @Step("User enter username and password")
  public void userEnterCredentials() {
    loginPage.userEnterCredentials();
  }

  @Step("User enter invalid username and password")
  public void userEnterInvalidCredentials() {
    loginPage.userEnterInvalidCredentials();
  }

  @Step("Check error message")
  public void checkInvalidCredentialsMessage() {
    loginPage.checkErrorMessage();
  }
}
