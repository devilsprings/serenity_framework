package com.dqhieu.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.FindBy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class commonElements extends PageObject {
  @FindBy(xpath = "//a[text()='Input Forms']")
  public WebElementFacade sb_inputForm;

  @FindBy(xpath = "//a[text()='Input Forms']/..//a[text()='Simple Form Demo']")
  public WebElementFacade sb_simpleFormDemo;

  @FindBy(xpath = "//a[text()='No, thanks!']")
  public WebElementFacade closePopupBtn;

  @FindBy(id = "user-message")
  public WebElementFacade messageField;

  @FindBy(xpath = "//button[text()='Show Message']")
  public WebElementFacade showMessageButton;

  @FindBy(id= "display")
  public WebElementFacade verifyMessage;

  @FindBy(id = "sum1")
  public WebElementFacade firstField;

  @FindBy(id = "sum2")
  public WebElementFacade secondField;

  @FindBy(xpath = "//button[text()='Get Total']")
  public WebElementFacade getTotalButton;

  @FindBy(id = "displayvalue")
  public WebElementFacade verifyGetTotal;

  @FindBy(xpath = "//a[text()='Input Forms']/..//a[text()='Radio Buttons Demo']")
  public WebElementFacade radioButtonDemo;

  @FindBy(xpath = "//a[text()='Input Forms']/..//a[text()='Checkbox Demo']")
  public WebElementFacade checkboxDemo;

  @FindBy(xpath = "//a[text()='Input Forms']/..//a[text()='Input Form Submit']")
  public WebElementFacade inputFormSubmit;

  @FindBy(xpath = "//input[@name='email']")
  public WebElementFacade emailField;

  @FindBy(xpath = "//small[contains(text(),'supply a valid email')]")
  public WebElementFacade emailError;

  @FindBy(xpath = "//input[@name=\"phone\"]")
  public WebElementFacade phoneField;

  @FindBy(xpath = "//textarea[@name='comment']")
  public WebElementFacade projectDescription;

  @FindBy(xpath = "//small[contains(text(),'enter at least 10 characters')]")
  public WebElementFacade projectDescriptionError;

  public void clickInputForm(){
    sb_inputForm.waitUntilVisible().click();
  }

  public void clickSimpleForm() throws Throwable {
    sb_simpleFormDemo.waitUntilVisible().click();
    Thread.sleep(5000);
  }

  public void closeAdsPopup() {
    try {
      closePopupBtn.waitUntilVisible().click();
    } catch (Exception ignored) {
    }

  }

  //    public void clickOnSidebarMenu(String sidebarMenu) {
////        waitFor(closePopupBtn).waitUntilNotVisible();
//        find(By.xpath(String.format("//li[@class='tree-branch']//a[contains(text(), '%s')]", sidebarMenu))).waitUntilClickable().click();
//    }
  public void enterYourMessage() throws Throwable {
    Random generator = new Random();
    int i = generator.nextInt(99);

    String s = RandomStringUtils.randomAlphabetic(2).toLowerCase(Locale.ROOT);

    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
    Date date = new Date();
    String currentDate= dateFormat.format(date);

    String message = String.format("%02d", i)+s+currentDate;
    messageField.waitUntilVisible().sendKeys(message);
    Thread.sleep(2000);

  }
  public void showMessage(){
    showMessageButton.waitUntilVisible().click();
  }
  public boolean verifyMessage(){
    if (verifyMessage.waitUntilVisible().isDisplayed()) {
      System.out.println(verifyMessage.getText());
    }

    return false;
  }
  public void enterFirstValue(String firstValue){
    firstField.waitUntilVisible().sendKeys(firstValue);
  }
  public void enterSecondValue(String secondValue){
    secondField.waitUntilVisible().sendKeys(secondValue);
  }
  public void getTotal(){
    getTotalButton.waitUntilVisible().click();
  }
  public boolean verifyTotal(){
    if (verifyGetTotal.waitUntilVisible().isDisplayed()){
      System.out.println(verifyGetTotal.getText());
    }
    return false;

  }
  //    public void verifySum(){
//        int sum = 8;
//        switch (sum){
//            case 6:
//                sb_inputForm.waitUntilVisible().click();
//                radioButtonDemo.waitUntilVisible().click();
//                break;
//            case 8:
//                sb_inputForm.waitUntilVisible().click();
//                checkboxDemo.waitUntilVisible().click();
//                break;
//            default:
//                break;
//        }
//    }
  public void clickInputFormSubmit(){
    inputFormSubmit.waitUntilVisible().click();
  }
  public void enterEmail(String email) throws Throwable {
    emailField.waitUntilVisible().sendKeys(email);
    Thread.sleep(1000);
    if (!emailError.waitUntilVisible().isDisplayed()){

    }else {
      emailField.waitUntilVisible().clear();
      String s = RandomStringUtils.randomAlphabetic(5).toLowerCase(Locale.ROOT);
      emailField.sendKeys(s +"@gmail.com");
      Thread.sleep(2000);
    }

  }
  public void verifyEmailError(){
    emailError.waitUntilNotVisible();
  }
  public void enterPhone(String phoneNumb) throws Throwable {
    String s = RandomStringUtils.randomNumeric(8);
    phoneField.waitUntilVisible().sendKeys(phoneNumb+s);
    Thread.sleep(2000);
  }
  public void enterProjectDescription(String letter){
    projectDescription.waitUntilVisible().sendKeys(letter);
    projectDescriptionError.waitUntilVisible().isDisplayed();
    System.out.println(projectDescriptionError.getText());
  }
  public void verifyProjectDescription() throws Throwable {
    int n = 2;
    while (n<=10) {
      projectDescription.waitUntilVisible().sendKeys("a");
      n++;
    }
    Thread.sleep(5000);
    projectDescriptionError.waitUntilNotVisible();
  }
}
