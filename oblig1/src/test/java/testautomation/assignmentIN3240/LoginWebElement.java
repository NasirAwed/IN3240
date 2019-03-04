package testautomation.assignmentIN3240;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebElement {
	WebDriver driver;

	//@FindBy(linkText = "Login")
	//WebElement loginBtn;

	
	//Static initElement method of PageFactory class for initializing WebElement
	public LoginWebElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Login
	public void loginValidUser() {
		/**
	     * fill in the code to complete the method
	    */
	}
}
