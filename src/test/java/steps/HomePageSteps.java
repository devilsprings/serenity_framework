package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class HomePageSteps extends PageObject {

  pageObject.HomePage homePage;

  @Step
  public void verifyHomepageVisibility() {
    homePage.verifyHomepageVisibility();
  }

  public void verifyHomepageHidden() {
    homePage.verifyHomepageHidden();
  }

}
