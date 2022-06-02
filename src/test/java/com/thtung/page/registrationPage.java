package com.thtung.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.junit.annotations.Qualifier;
import org.openqa.selenium.By;

public class registrationPage extends PageObject {
  @FindBy(id = "newpopup-register-user")
  public WebElementFacade inputDisplayName;

  @FindBy(id = "newpopup-register-email")
  public WebElementFacade inputEmail;

  @FindBy(id = "newpopup-register-pass")
  public WebElementFacade inputPassword;

  @FindBy(name = "btnsignup")
  public WebElementFacade btnSignup;

  @FindBy(id = "newnav-register")
  public WebElementFacade btnRegister;


  @Step("Click Signup button")
  public void clickRegisterButton() {
    waitFor(btnRegister).waitUntilVisible().click();
  }
  @Step("Input information")
  public void inputUserInformation(String name, String email, String password) {
    waitFor(inputDisplayName).waitUntilPresent().sendKeys(name);
    waitFor(inputEmail).waitUntilPresent().sendKeys(email);
    waitFor(inputPassword).waitUntilPresent().sendKeys(password);
  }

  @Step("Click Signup button")
  public void clickSignUpButton() {
    waitFor(btnSignup).waitUntilVisible().click();
  }

  @Step("Verify error message")
  public boolean verifyErrorMessageDisplay(String errorMsg) {
    return find(By.xpath(String.format("(//div[contains(text(), '%s')])[2]", errorMsg))).isDisplayed();
  }
}
