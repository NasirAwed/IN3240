package testautomation.assignmentIN3240;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerWebElement {
  WebDriver driver;

  @FindBy(xpath = "//a[@class='btn btn-primary']")
  WebElement createNewBtn;

  // Static initElement method of PageFactory class for initializing WebElement
  public CustomerWebElement(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void create() {
    driver.findElement(By.xpath("/html/body/div/div/p[1]/a")).click();
  }

  public WebElement findCustomer() {
    String res = driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[2]/td[1]")).getText();
    
     int i = 2;
     while(res!=null) {
         res= driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr["+ i + "]/td[1]")).getText();
         if(res.equals("NN")) {
        	 System.out.println(res);
        	 break;
         }
         else {
         i++;
         }
     }
   
     return driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr["+ i + "]/td[7]//a[3]"));
  }

  public void update() {
    /** fill in the code to complete the method */
  }

  public void delete() {
    /** fill in the code to complete the method */
  }
}
