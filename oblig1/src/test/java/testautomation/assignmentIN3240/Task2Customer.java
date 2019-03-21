package testautomation.assignmentIN3240;

import static org.testng.Assert.assertEquals;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task2Customer {
  WebDriver driver;
  private static ExtentReports report;
  private static ExtentTest test;
  private String customerName = "Big Pizza";
  private String companyName = "Free Food";

  @BeforeClass
  public void beforeClass() {
    report = new ExtentReports("Task2.html");
    test = report.startTest("Task 2");

    driver = new ChromeDriver();
    test.log(LogStatus.INFO, "Browser started");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().setSize(new Dimension(1920, 1080)); // maximize had no effect for me
    driver.manage().window().maximize();
    driver.get("https://itera-qa.azurewebsites.net/");
  }

  @Test(priority = 1, description = "Login with valid user")
  public void login() {
    // Click login button
    driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/ul/li[2]/a")).click();

    // Enter login credentials
    driver.findElement(By.xpath("//*[@id=\"Username\"]")).sendKeys("fakeUsername1");
    driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("fakeultrahackablepassword1");

    // Click login submit
    driver
        .findElement(By.xpath("/html/body/div/div[1]/form/table/tbody/tr[7]/td[2]/input[1]"))
        .click();

    // Confirm welcome screen
    WebElement welcomeLabel = driver.findElement(By.xpath("/html/body/div/div/h3"));
    Assert.assertNotNull(welcomeLabel, "Failed to login successfully");
  }

  @Test(priority = 2, description = "Create customer")
  public void create() {
    // Press create user button
    driver.findElement(By.xpath("/html/body/div/div/p[1]/a")).click();

    // Enter user data
    driver.findElement(By.xpath("//*[@id=\"Name\"]")).sendKeys(customerName);
    driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys(companyName);
    driver.findElement(By.xpath("//*[@id=\"Address\"] ")).sendKeys("adresse");
    driver.findElement(By.xpath("//*[@id=\"City\"]")).sendKeys("oslo");
    driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys("9329233");
    driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("fake@hotmailcom");

    // Submit
    driver.findElement(By.xpath("/html/body/div/form/div/div[7]/div/input")).click();

    // Confirm created user
    driver.findElement(By.xpath("//*[contains(text(),'poopie')]"));
  }

  @Test(priority = 3, description = "Update customer")
  public void update() throws InterruptedException {
    // Trusting preconditions (being logged in) from previous tests.
    // Might be a bad idea, but it works in this application.

    String res =
        driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[2]/td[1]")).getText();

    int i = 2;
    while (res != null) {
      res =
          driver
              .findElement(By.xpath("/html/body/div/div/table/tbody/tr[" + i + "]/td[1]"))
              .getText();
      if (res.equals(customerName)) {
        break;
      } else {
        i++;
      }
    }

    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[" + i + "]/td[7]/a[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"Phone\"]")).clear();
    driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys("999999");
    driver.findElement(By.xpath("/html/body/div/form/div/div[7]/div/input")).click();
    assertEquals(
        driver
            .findElement(By.xpath("/html/body/div/div/table/tbody/tr[" + i + "]/td[5]"))
            .getText(),
        "999999");

    /** fill in the code to complete the test method Call login method from LoginWebElement.java */
    // TODO ^ what is this comment?
  }

  @Test(priority = 4, description = "Delete customer")
  public void delete() {
    CustomerWebElement customer = new CustomerWebElement(driver);
    customer.findCustomer(customerName).click();
    driver.findElement(By.xpath("/html/body/div/div/form/div/input")).click();
    driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/ul/li[2]/a")).click();
  }

  // Take a screenShots if test fail
  @AfterMethod
  public void tearDown(ITestResult testResult) throws IOException {
    if (testResult.getStatus() == ITestResult.FAILURE) {
      String path = ScreenShots.takeScreenshot(driver, testResult.getName());
      String imagePath = test.addScreenCapture(path);
      test.log(LogStatus.FAIL, "TASK 2 - FAILED", imagePath);
    }
  }

  // Take a screenShots if test passed
  @AfterMethod
  public void Summary(ITestResult summary) throws IOException {
    if (summary.getStatus() == ITestResult.SUCCESS) {
      String path = ScreenShots.takeScreenshot(driver, summary.getName());
      String imagePath = test.addScreenCapture(path);
      test.log(LogStatus.PASS, "TASK 2 - PASSED", imagePath);
    }
  }

  @AfterClass
  public void endTest() {
    driver.close(); // Close browser
    report.flush(); // Appends the HTML file with all the ended tests.
  }
}
