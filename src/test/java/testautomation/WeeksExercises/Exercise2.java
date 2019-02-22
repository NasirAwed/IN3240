package testautomation.WeeksExercises;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Exercise2 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
	}

	@Test
	public void checkBoxRadioButton() {
		driver.findElement(By.id("other")).click();
		driver.findElement(By.id("tuesday")).click();
		driver.findElement(By.id("friday")).click();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
