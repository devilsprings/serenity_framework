package testcases;

import net.serenitybdd.core.annotations.events.AfterScenario;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HomePageSteps;
import steps.LoginPageSteps;

@RunWith(SerenityRunner.class)
public class LoginTest extends PageObject {
  @Managed WebDriver driver;

  @Steps LoginPageSteps loginPage;

  @Steps HomePageSteps homePage;

  @Test
  public void validLoginTest() {
    driver.get("https://hrms.cmcglobal.com.vn/");
    loginPage.verifyTitle();
    loginPage.userEnterCredentials();
    homePage.verifyHomepageVisibility();
  }

  @Test
  public void invalidLoginTest() {
    driver.get("https://hrms.cmcglobal.com.vn/");
    loginPage.verifyTitle();
    loginPage.userEnterInvalidCredentials();
    loginPage.checkInvalidCredentialsMessage();
    homePage.verifyHomepageHidden();
  }

  @AfterScenario
  public void testTeardown() {
    driver.close();
    driver.quit();
  }
}
