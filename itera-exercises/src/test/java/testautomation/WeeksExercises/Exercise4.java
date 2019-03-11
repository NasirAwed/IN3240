package testautomation.WeeksExercises;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exercise4 {
  WebDriver driver;

  @BeforeClass
  public void beforeClass() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://itera-qa.azurewebsites.net/home/automation");
  }

  @Test
  public void checkBoxRadioButtonXpath() {
    /** fill in the code to complete the test method */
  }

  @AfterClass
  public void afterClass() {
    driver.close();
  }
}
