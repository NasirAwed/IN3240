package testautomation.assignmentIN3240;

import static org.testng.Assert.assertEquals;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
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

public class Task1User {

	private WebDriver driver;
	private static ExtentReports report;
	private static ExtentTest test;
	

	@BeforeClass
	public void beforeClass() {
		/**
	     * Test report will be generated to below path
	     * This path (C:\\Reports\\IN3240\\Task1.html) for Windows. 
	     * For Mac/Linux you need to change path
	    */
		report = new ExtentReports("C:\\Reports\\IN3240\\Task1.html");  
		test = report.startTest("Task 1");
		//XPath xPath =  XPathFactory.newInstance().newXPath();
		System.setProperty("webdriver.chrome.driver", "/Users/nasirawed/Documents/in3240/workspace/chromedriver"); 
		driver = new ChromeDriver();
		test.log(LogStatus.INFO, "Browser started");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/");
		
	}

	@Test
	public void createNewUser() throws InterruptedException {
		
		//Create a new instance of the NewUserWebElement page object
		NewUserWebElement user = new NewUserWebElement(driver);
		user.clickSignUpBtn();
		WebElement nameElemen = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		nameElemen.sendKeys("FirstNamefake1");
		WebElement surName = driver.findElement(By.xpath("//*[@id=\"Surname\"]"));
		surName.sendKeys("surnamefake1");
		WebElement eMail = driver.findElement(By.xpath("//*[@id=\"E_post\"]"));
		eMail.sendKeys("FakeEmail1@hotmail.com");
		WebElement phonenr = driver.findElement(By.xpath("//*[@id=\"Mobile\"]"));
		phonenr.sendKeys("9932939");
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"Username\"]"));
		userName.sendKeys("fakeUsername1");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		password.sendKeys("fakeultrahackablepassword1");
		WebElement confirmPassword = driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
		confirmPassword.sendKeys("fakeultrahackablepassword1");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click(); 
		
		TimeUnit.SECONDS.sleep(10);
		String  string = driver.findElement(By.xpath("/html/body/div/form/div/div[9]/div/label")).getText();
		if(string.length()!=0) {
		assertEquals(driver.findElement(By.xpath("/html/body/div/form/div/div[9]/div/label")).getText(),"Registration Successful");
		}
		else {System.out.println("String 1 is null or empty?"); }
		/**
	     * fill in the code to complete the test method
	    */
		
	}
	
	
	
	/**
     * For Mac/Linux you need to change path in ScreenShots.java    
    */
	
	//Take a screenShots if test fail
	@AfterMethod
	public void tearDown(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			String path = ScreenShots.takeScreenshot(driver, testResult.getName());
			String imagePath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, "TASK 1 - FAILED", imagePath);
		}
	}
	
	//Take a screenShots if test pass
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
