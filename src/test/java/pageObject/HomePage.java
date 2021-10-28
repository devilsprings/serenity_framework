package pageObject;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.temporal.ChronoUnit;

public class HomePage extends PageObject {
  public static String actualCheckInTime;
  public static String checkInTime;
  public static String actualCheckOutTime;
  public static String checkOutTime;

  public void verifyHomepageVisibility() {
    WebElementFacade btnReqMgmt =
        $(By.xpath("//li[@role='menuitem']/child::a[contains(text(), 'Request Management')]"));
    btnReqMgmt.waitUntilClickable();
  }

  public void waitUntilPageLoaded() {
    WebElementFacade loadingIcon = $(By.xpath("//i[@class='ant-spin-dot-item']"));
    loadingIcon.withTimeoutOf(60, ChronoUnit.SECONDS).waitUntilNotVisible();
  }

  public void gotoCheckInOutTimeTab() {
    WebElementFacade btnCheckInOutTime =
        $(By.xpath("//li[@role='menuitem']/child::a[contains(text(), 'Check In-Out Time')]"));
    btnCheckInOutTime.waitUntilClickable().click();
  }

  public void getTodayCheckInTime() {
    WebElementFacade labelCheckInTime =
        $(By.xpath("(//div[contains(@class, 'is-active')]//span[2])[1]"));
    actualCheckInTime = labelCheckInTime.waitUntilVisible().getText();
    checkInTime = actualCheckInTime.replaceFirst(":", "");
  }

  public void getTodayCheckOutTime() {
    WebElementFacade labelCheckOutTime =
        $(By.xpath("(//div[contains(@class, 'is-active')]//span[2])[2]"));
    actualCheckOutTime = labelCheckOutTime.waitUntilVisible().getText();
    checkOutTime = actualCheckOutTime.replaceFirst(":", "");
  }
}
