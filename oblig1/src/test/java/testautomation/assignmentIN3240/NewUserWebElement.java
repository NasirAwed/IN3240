package testautomation.assignmentIN3240;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NewUserWebElement {
  WebDriver driver;


	//@FindBy(linkText = "Sign Up")
	//WebElement signUpBtn;
	
	//Static initElement method of PageFactory class for initializing WebElement
	public NewUserWebElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickSignUpBtn() {
		
		driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/ul/li[1]/a")).click();
		
		/*WebElement mobile = driver.findElement(By.xpath("/html/body/nav/button/span"));
		if (mobile != null) {
			mobile.click();
		
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/ul/li[1]/a"));
		signup.click();
	}*/
		/**
	     * fill in the code to complete the method
	    */
	}
	
	

}
