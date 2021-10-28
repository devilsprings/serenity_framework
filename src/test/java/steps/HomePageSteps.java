package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class HomePageSteps extends PageObject {

  pageObject.HomePage homePage;

  @Step
  public void verifyHomepageVisibility() {
    homePage.waitUntilPageLoaded();
    homePage.verifyHomepageVisibility();
  }

  @Step("Get today check in time")
  public void getTodayCheckInTime() {
    homePage.getTodayCheckInTime();
  }

  @Step("Get today check out time")
  public void getTodayCheckOutTime() {
    homePage.getTodayCheckOutTime();
  }

  @Step("View time table")
  public void gotoCheckInOutTimeTab() {
    homePage.waitUntilPageLoaded();
    homePage.gotoCheckInOutTimeTab();
  }
}
