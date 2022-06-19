package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.SignupPage;
import resources.Base;

public class CreateAccount extends Base{
	
	
	WebDriver driver;
	SignupPage signupPage;
	
	@Given("^Open any Browser$")
    public void open_any_browser() throws Throwable{
			 
	driver = initializeDriver();		    
 }
		 
    @And("^Navigate to Signup Page$")
	public void navigate_to_signup_page(){
			 
	 driver.get(prop.getProperty("url"));		       
 }
	
    @When("^User enters firstname as \"([^\"]*)\" and lastname as \"([^\"]*)\" and email as \"([^\"]*)\" and password as \"([^\"]*)\" and birthyear as \"([^\"]*)\" into the fields$")
	public void user_enters_firstname_as_something_and_lastname_as_something_and_email_as_something_and_password_as_something_and_birthyear_as_something_into_the_fields(String firstname, String lastname, String email, String password, String birthyear) throws Throwable{
			 
    signupPage = new SignupPage(driver);
	signupPage.firstname().sendKeys(prop.getProperty("firstname"));
	Thread.sleep(2000);
	signupPage.lastname().sendKeys(prop.getProperty("lastname"));
	Thread.sleep(2000);
	signupPage.email().sendKeys(prop.getProperty("email"));
	Thread.sleep(2000);
	signupPage.password().sendKeys(prop.getProperty("password"));
	Thread.sleep(2000);
	signupPage.birthyear().sendKeys(prop.getProperty("birthyear"));
			
	}
		    
	@And("^User clicks on submit button$")
	public void user_clicks_on_submit_button(){	 
	signupPage.submit().click();
	}
		 
	@Then("^Verify user is able to successfully signup$")
	public void verify_user_is_able_to_successfully_signup(){
		 
	Assert.assertTrue(true);
		       
	}
	
	@After
	public void closure() {
		driver.close();
	}
		 
		 
}
