package testautomation.assignmentIN3240;

import static org.testng.Assert.assertEquals;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task1User {

  private WebDriver driver;
  private static ExtentReports report;
  private static ExtentTest test;

  @BeforeClass
  public void beforeClass() {
    report = new ExtentReports("Task1.html");
    test = report.startTest("Task 1");
    // XPath xPath =  XPathFactory.newInstance().newXPath(); TODO what is this?

    driver = new ChromeDriver();
    test.log(LogStatus.INFO, "Browser started");
    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    driver.manage().window().setSize(new Dimension(1920, 1080)); // for my linux shit
    driver.manage().window().maximize();
    driver.get("https://itera-qa.azurewebsites.net/");
  }

  @Test
  public void createNewUser() throws InterruptedException {
    // Click sign-up button
    driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/ul/li[1]/a")).click();

    // Enter full name
    driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("FirstNamefake1");
    driver.findElement(By.xpath("//*[@id=\"Surname\"]")).sendKeys("surnamefake1");

    // Contact info
    driver.findElement(By.xpath("//*[@id=\"E_post\"]")).sendKeys("FakeEmail1@hotmail.com");
    driver.findElement(By.xpath("//*[@id=\"Mobile\"]")).sendKeys("9932939");

    // Login credentials
    driver.findElement(By.xpath("//*[@id=\"Username\"]")).sendKeys(UUID.randomUUID().toString());
    driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("fakeultrahackablepassword1");
    driver
        .findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"))
        .sendKeys("fakeultrahackablepassword1");

    // Submit
    driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

    // Confirm registration
    String successLabel = driver.findElement(By.xpath("/html/body/div/form/div/div[9]/div/label")).getText();
    Assert.assertTrue(successLabel.length() > 0, "Registration not successfull");
  }

  /** For Mac/Linux you need to change path in ScreenShots.java */

  // Take a screenShots if test fail
  @AfterMethod
  public void tearDown(ITestResult testResult) throws IOException {
    if (testResult.getStatus() == ITestResult.FAILURE) {
      String path = ScreenShots.takeScreenshot(driver, testResult.getName());
      String imagePath = test.addScreenCapture(path);
      test.log(LogStatus.FAIL, "TASK 1 - FAILED", imagePath);
    }
  }

  // Take a screenShots if test pass
  @AfterMethod
  public void Summary(ITestResult summary) throws IOException {
    if (summary.getStatus() == ITestResult.SUCCESS) {
      String path = ScreenShots.takeScreenshot(driver, summary.getName());
      String imagePath = test.addScreenCapture(path);
      test.log(LogStatus.PASS, "TASK 1 - PASSED", imagePath);
    }
  }

  @AfterClass
  public void endTest() {
    driver.close(); // Close browser
    report.flush(); // Appends the HTML file with all the ended tests.
  }
}
