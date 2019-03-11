package testautomation.WeeksExercises;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exercise1 {
  WebDriver driver;

  @BeforeClass
  public void beforeClass() {
    // The annotated method will be run before the first test method in the current
    // class is invoked.

    driver = new ChromeDriver(); // Creating New Instance Of Chrome Driver
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    // Force webdriver to wait 10 second if element not found on page
    driver.manage().window().maximize(); // Maximize browser
    driver.get("https://itera-qa.azurewebsites.net/home/automation"); // Open URL In Browser
  }

  @Test
  public void textarea() {
    driver.findElement(By.id("name")).sendKeys("hume");
    driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("123 45 678");
    ;
    // TODO email, password, address, submit
  }

  @AfterClass
  public void afterClass() {
    Prompter pr = new Prompter();
    pr.pressAnyKey();
    driver.close();
  }
}
