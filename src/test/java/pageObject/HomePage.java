package pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public void verifyHomepageVisibility() {
        WebElementFacade btnReqMgmt =
                $(By.xpath("//li[@role='menuitem']/child::a[contains(text(), 'Request Management')]"));
        btnReqMgmt.shouldBeVisible();
    }

    public void verifyHomepageHidden() {
        WebElementFacade btnReqMgmt =
                $(By.xpath("//li[@role='menuitem']/child::a[contains(text(), 'Request Management')]"));
        btnReqMgmt.shouldNotBeVisible();
    }
}
