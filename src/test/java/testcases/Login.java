package testcases;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class Login {
  @Managed WebDriver driver;

  @Test
  public void loginTest() throws InterruptedException {
    driver.get("http://192.168.67.35");
    driver.findElement(By.id("normal_login_username")).sendKeys("ptqanh");
    driver.findElement(By.id("normal_login_password")).sendKeys("123456a@");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(3000);
  }
}
