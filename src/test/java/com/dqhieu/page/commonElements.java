package com.dqhieu.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class commonElements extends PageObject {

    @FindBy(xpath = "//a[contains(text(), 'Input Forms')]")
    public WebElementFacade sb_inputForm;

    @FindBy(xpath = "//a[contains(text(), 'Simple Form Demo')]")
    public WebElementFacade sb_simpleFormDemo;

    @FindBy(id = "at-cv-lightbox-close")
    public WebElementFacade closePopupBtn;

    public void closeAdsPopup() {
        closePopupBtn.waitUntilVisible().click();
    }

    public void clickOnSidebarMenu(String sidebarMenu) {
//        waitFor(closePopupBtn).waitUntilNotVisible();
        find(By.xpath(String.format("//li[@class='tree-branch']//a[contains(text(), '%s')]", sidebarMenu))).waitUntilClickable().click();
    }
}
