package testautomation.assignmentIN3240;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginWebElement {
  WebDriver driver;

  // @FindBy(linkText = "Login")
  // WebElement loginBtn;

  // Static initElement method of PageFactory class for initializing WebElement
  public LoginWebElement(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  // Login
  public void loginValidUser() {
    driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/ul/li[2]/a")).click();
  }
}
