package com.dqhieu.page;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class pageObject extends PageObject {

  public void goToMobileMenu() {
    WebElementFacade btnMobile = $(By.id("MobileSec"));
    btnMobile.waitUntilVisible().click();
  }

  public void goToMobileRatePlan() {
    WebElementFacade btnMobileRatePlan = $(By.xpath("//a[contains(text(), 'Mobile Rate Plans')]"));
    btnMobileRatePlan.waitUntilVisible().click();
  }

  public void clickNextButtonSelectPlanScreen() {
    WebElementFacade btnNext = $(By.xpath("//a[@class='flex-next']"));
    btnNext.waitUntilVisible().click();
  }

  public void clickGetRs600Plan() {
    WebElementFacade btnGetPlan600 = $(By.id("PostpaidPlan600"));
    while (!checkRs600PlanVisibility()) {
      clickNextButtonSelectPlanScreen();
      if (checkRs600PlanVisibility()) {
        btnGetPlan600.click();
        break;
      }
    }
  }

  public boolean checkRs600PlanVisibility() {
    WebElementFacade btnGetPlan600 = $(By.id("PostpaidPlan600"));
    try {
      btnGetPlan600.waitUntilVisible().isVisible();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public boolean checkOTPPopUpVisibility() {
    WebElementFacade btnVerify = $(By.id("o2a-verify-otp"));
    return btnVerify.waitUntilVisible().isVisible();
  }

  public void selectForeignerIdentityVerificationScr() {
    WebElementFacade radioBtnForeigner = $(By.id("ends-with-checkbox"));
    radioBtnForeigner.waitUntilVisible().click();
  }

  public void inputPassportNumber(String passportNumber) {
    WebElementFacade passportField = $(By.id("o2a-step2-passport"));
    passportField.waitUntilVisible().type(passportNumber);
  }

  public void inputMobileNumber(String mobileNumber) {
    WebElementFacade passportField = $(By.id("enter-mobile-num"));
    passportField.waitUntilVisible().type(mobileNumber);
  }

  public void clickContinueButton( ) {
    WebElementFacade passportField = $(By.id("continue-button"));
    passportField.click();
  }
}
