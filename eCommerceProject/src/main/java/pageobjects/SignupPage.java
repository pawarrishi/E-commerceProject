package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
	WebDriver driver;
	
	public SignupPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "usernamereg-firstName")
	private WebElement firstname;
	
	@FindBy(id = "usernamereg-lastName")
	private WebElement lastname;
	
	@FindBy(id = "usernamereg-userId")
	private WebElement email;
	
	@FindBy(id = "usernamereg-password")
	private WebElement password;
	
	@FindBy(id = "usernamereg-birthYear")
	private WebElement birthyear;
	
	@FindBy(id = "reg-submit-button")
	private WebElement submit;
	
	public WebElement firstname(){
		
		return firstname;
	}
	
     public WebElement lastname(){
		
		return lastname;
	}
     
     public WebElement email(){
 		
 		return email;
 	}
     
     public WebElement password(){
 		
 		return password;
 	}
     
     public WebElement birthyear(){
 		
 		return birthyear;
 	}
     
     public WebElement submit(){
 		
 		return submit;
 	}

}
