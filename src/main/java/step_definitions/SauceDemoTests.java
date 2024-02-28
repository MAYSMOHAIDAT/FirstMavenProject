package step_definitions;

import Utiles.BrowserUtils;

import Utiles.DataReader;
import Utiles.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SauceDemoLoginPage;
import pages.SauceHomePage;
import org.junit.Assert;



public class SauceDemoTests {
	
	BrowserUtils utils=new BrowserUtils();
	SauceDemoLoginPage obj=new SauceDemoLoginPage();
	
	SauceDemoLoginPage sauceloginpage = new SauceDemoLoginPage();
	SauceHomePage homepage = new SauceHomePage();
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		Driver.getDriver().get(DataReader.getProperty("sauce_url"));
	    
	}

	@When("user inter a valid username and valid password")
	public void user_inter_a_valid_username_and_valid_password() {
		sauceloginpage.loginUserName.sendKeys(DataReader.getProperty("sauce_username"));
		sauceloginpage.loginPassword.sendKeys(DataReader.getProperty("sauce_password"));
	
	}

	@When("user clicks on signin button")
	public void user_clicks_on_signin_button() {
	    sauceloginpage.LoginBtn.click();
	}

	@Then("user logged successfuly")
	public void user_logged_successfuly() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(homepage.homepage_product_text.isDisplayed());
	}
      
	
	
	
	//invalid user login scenario =starts
	
	
	@When("user inters invalid username and valid password")
	public void user_inters_invalid_username_and_valid_password() {
		sauceloginpage.loginUserName.sendKeys("hellohello@gmail.com");
		sauceloginpage.loginPassword.sendKeys(DataReader.getProperty("sauce_password"));
	}

	@Then("user should not be logged in")
	public void user_should_not_be_logged_in() throws InterruptedException {
	   Thread.sleep(2000);
	   Assert.assertTrue(sauceloginpage.LoginBtn.isDisplayed());
	}

	//invalid user login scenario =ends
	
	
	
	
	
	//valid user invalid password login scenario =start
	
	@When("user inters valid username and invalid password")
	public void user_inters_valid_username_and_invalid_password() {
		sauceloginpage.loginUserName.sendKeys(DataReader.getProperty("sauce_username"));
		sauceloginpage.loginPassword.sendKeys("123456789");
	}

	//valid user invalid password login scenario = end
	
	
	
	
	
	// scenario outline invalid  - starts
	
		@When("user enters username {string} and password {string}")
		public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
//			utils.waitForElementToBeVisible(obj.loginUserName);
			
			sauceloginpage.loginUserName.sendKeys(username);
			sauceloginpage.loginPassword.sendKeys(password);
			Thread.sleep(2000);
		}
		
	
		// scenario outline invalid  - ends
	
	
	
	
	
	
	//scenario step parameter -start
		@When("user inters invalid username {string} and invalid password {string}")
		public void user_inters_invalid_username_and_invalid_password(String username, String password) {
			sauceloginpage.loginUserName.sendKeys(username);
			sauceloginpage.loginPassword.sendKeys(password);
		}
		@Then("user should not be logged in with and messege as {string}")
		public void user_should_not_be_logged_in_with_and_messege_as(String errormessage) {
		   System.out.println(errormessage);
		}


		//scenario step parameter -end
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	


}


