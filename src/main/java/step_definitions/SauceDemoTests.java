package step_definitions;

import Utiles.DataReader;
import Utiles.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SauceDemoLoginPage;
import pages.SauceHomePage;
import org.junit.Assert;



public class SauceDemoTests {
	
	
	
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



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	


}


