package testReport;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import testReport.ScreenShots;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Exercise1ExtentReports {
	WebDriver driver;
	private static ExtentReports report;
	private static ExtentTest test;

	@BeforeClass
	public void beforeClass() {
		report = new ExtentReports("C:\\Reports\\IN3240\\Exercise1.html");
		test = report.startTest("Exercise1");
		driver = new ChromeDriver();
		test.log(LogStatus.INFO, "Launched new browser");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		test.log(LogStatus.INFO, "Navigated to " + driver.getCurrentUrl());
	}

	@Test(priority = 1)
	public void textarea() {

		WebElement nameElement = driver.findElement(By.id("name"));
		nameElement.sendKeys("Ola Nordmann");
		test.log(LogStatus.INFO, "Navn: " + nameElement.getAttribute("value"));

		WebElement phoneElement = driver.findElement(By.id("phone"));
		phoneElement.sendKeys("+4712345678");
		test.log(LogStatus.INFO, "Phone: " + phoneElement.getAttribute("value"));

		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("test@test.no");
		test.log(LogStatus.INFO, "Email: " + emailElement.getAttribute("value"));

		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("itera");

		WebElement addressElement = driver.findElement(By.id("address"));
		addressElement.sendKeys("Nydalsveien 28");
		test.log(LogStatus.INFO, "Address: " + addressElement.getAttribute("value"));

		driver.findElement(By.name("submit")).click();
		test.log(LogStatus.INFO, "Clicked on Submit button");

	}

	/**
	 * For Mac/Linux you need to change path in ScreenShots.java
	 */

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
	public void afterClass() {
		driver.close();
		test.log(LogStatus.INFO, "Browser is closed");
		report.flush();// Appends the HTML file with all the ended tests.
	}

}
