package testcases;

import net.serenitybdd.core.annotations.events.AfterScenario;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pageObject.HomePage;
import steps.HomePageSteps;
import steps.LoginPageSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "data/data.csv")
public class CheckTimeTableTest extends PageObject {
  private String username;
  private Integer expectedCheckInTime;
  private Integer expectedCheckOutTime;

  @Managed WebDriver driver;

  @Steps LoginPageSteps loginPage;

  @Steps HomePageSteps homePage;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Integer getExpectedCheckInTime() {
    return expectedCheckInTime;
  }

  public void setExpectedCheckInTime(Integer expectedCheckInTime) {
    this.expectedCheckInTime = expectedCheckInTime;
  }

  public Integer getExpectedCheckOutTime() {
    return expectedCheckOutTime;
  }

  public void setExpectedCheckOutTime(Integer expectedCheckOutTime) {
    this.expectedCheckOutTime = expectedCheckOutTime;
  }

  @Test
  public void validLoginTest() {
    String password = System.getenv("HRMS_PASS");
    driver.get("https://hrms.cmcglobal.com.vn/");
    driver.manage().window().maximize();
    loginPage.verifyTitle();
    loginPage.userEnterCredentials(username, password);
    homePage.verifyHomepageVisibility();
    homePage.gotoCheckInOutTimeTab();
    homePage.getTodayCheckInTime();
    homePage.getTodayCheckOutTime();
    printResult();
  }

  @Step
  public void printResult() {
    System.out.println(
        "Today Checkin - Checkout time: " + HomePage.checkInTime + " - " + HomePage.checkOutTime);
    System.out.println(
        "Expected Checkin - Checkout time: 0" + expectedCheckInTime + " - " + expectedCheckOutTime);
    System.out.println(
        "Late Coming: " + (Integer.parseInt(HomePage.checkInTime) > expectedCheckInTime));
    System.out.println(
        "Early leaving: " + (Integer.parseInt(HomePage.checkOutTime) < expectedCheckOutTime));
  }

  @AfterScenario
  public void testTeardown() {
    driver.close();
    driver.quit();
  }
}
