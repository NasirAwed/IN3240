package testautomation.assignmentIN3240;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
		/**
	     * fill in the code to complete the method
	    */
	}
	
	
}
