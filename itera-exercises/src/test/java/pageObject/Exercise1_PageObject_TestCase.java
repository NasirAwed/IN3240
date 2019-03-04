package pageObject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exercise1_PageObject_TestCase {
  WebDriver driver;
  Exercise1WebElement2 exercise1;

  @BeforeClass
  public void beforeClass() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://itera-qa.azurewebsites.net/home/automation");
  }

  @Test
  public void textarea() {
    exercise1 = new Exercise1WebElement2(driver);
    exercise1.fillInForm();
  }

  @AfterClass
  public void afterClass() {
    driver.close();
  }
}
