package testautomation.assignmentIN3240;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.awt.List;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task2Customer {
  WebDriver driver;
  private static ExtentReports report;
  private static ExtentTest test;

  @BeforeClass
  public void beforeClass() {
    /**
     * Test report will be generated to below path This path (C:\\Reports\\IN3240\\Task1.html) for
     * Windows. For Mac/Linux you need to change path
     */
    report = new ExtentReports("C:\\Reports\\IN3240\\Task2.html");
    test = report.startTest("Task 2");
    driver = new ChromeDriver();
    test.log(LogStatus.INFO, "Browser started");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://itera-qa.azurewebsites.net/");
  }

  @Test(priority = 1, description = "Login with valid user")
  public void login() {
    LoginWebElement login = new LoginWebElement(driver);
    login.loginValidUser();
    // Create a new instance of the LoginWebElement page object
    WebElement username = driver.findElement(By.xpath("//*[@id=\"Username\"]"));
    username.sendKeys("fakeUsername1");
    WebElement password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
    password.sendKeys("fakeultrahackablepassword1");
    driver
        .findElement(By.xpath("/html/body/div/div[1]/form/table/tbody/tr[7]/td[2]/input[1]"))
        .click();
  }

  @Test(priority = 2, description = "Create customer")
  public void create() {

    // Create a new instance of the CustomerWebElement page object
    CustomerWebElement customer = new CustomerWebElement(driver);
    customer.create();

    driver.findElement(By.xpath("//*[@id=\"Name\"]")).sendKeys("NN");
    driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("NN");
    driver.findElement(By.xpath("//*[@id=\"Address\"] ")).sendKeys("adresse");
    driver.findElement(By.xpath("//*[@id=\"City\"]")).sendKeys("oslo");
    driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys("9329233");
    driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("fake@hotmailcom");
    driver.findElement(By.xpath("/html/body/div/form/div/div[7]/div/input")).click();
  }

  @Test(priority = 3, description = "Update customer")
  public void update() throws InterruptedException {

    // Create a new instance of the LoginWebElement page object
    LoginWebElement login = new LoginWebElement(driver);
    login.loginValidUser();
    login();
    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[9]/td[7]/a[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"Phone\"]")).clear();
    driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys("999999");
    driver.findElement(By.xpath("/html/body/div/form/div/div[7]/div/input")).click();
    driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[9]/td[7]/a[1]")).click();
    // TimeUnit.SECONDS.sleep(5);
    // driver.findElement(By.xpath("/html/body/div/div/table/tbody/")).children();

    /* TODO fra Test Case 3 – Update customer: 5. Check that phone number is updated */
    List childs = (List) driver.findElements(By.xpath("/html/body/div/div/table/tbody/"));

    System.out.println(driver.findElement(By.xpath("//*[@id=\"Phone\"]")).getText());
    // assertEquals(driver.findElement(By.xpath("//*[@id=\"Phone\"]")).getText(),"999999");

    /** fill in the code to complete the test method Call login method from LoginWebElement.java */
  }

  @Test(priority = 4, description = "Delete customer")
  public void delete() {
    /**
     * fill in the code to complete the test method Call delete method from CsutomerWebElement.java
     */
  }

  /** For Mac/Linux you need to change path in ScreenShots.java */

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
