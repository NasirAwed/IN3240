package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Exercise1WebElement2 {
	WebDriver driver;
	
	@FindBy(id = "name")
	WebElement nameElement;
	
	@FindBy(id = "phone")
	WebElement phoneElement;
	
	@FindBy(id = "email")
	WebElement emailElement;
	
	@FindBy(id = "password")
	WebElement passwordElement;
	
	@FindBy(id = "address")
	WebElement addressElement;
	
	@FindBy(name = "submit")
	WebElement submitElement;

	
	public Exercise1WebElement2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void fillInForm(){
		nameElement.sendKeys("Ola Nordmann");
		phoneElement.sendKeys("+4712345678");
		emailElement.sendKeys("test@test.no");
		passwordElement.sendKeys("itera");
		addressElement.sendKeys("Nydalsveien 28");
		submitElement.click();
	}

}
