package pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

  public void verifyTitle() {
    String title = getDriver().getTitle();
    Assert.assertEquals(title, "Human Resource Management System");
  }

  public void userEnterCredentials() {
    WebElementFacade txtUsername = $(By.id("normal_login_username"));
    WebElementFacade txtPassword = $(By.id("normal_login_password"));
    txtUsername.typeAndTab("dqhieu");
    txtPassword.typeAndEnter("Suzume0513");
  }

  public void userEnterInvalidCredentials() {
    WebElementFacade txtUsername = $(By.id("normal_login_username"));
    WebElementFacade txtPassword = $(By.id("normal_login_password"));
    txtUsername.typeAndTab("ptqanh");
    txtPassword.typeAndEnter("123456a@");
  }

  public void checkErrorMessage() {
    WebElementFacade labelInvalidCredentials = $(By.xpath("//span[@class='ant-alert-message']"));
    labelInvalidCredentials.shouldBeVisible();
    Assert.assertTrue(labelInvalidCredentials.containsText("Invalid credentials"));
  }
}
