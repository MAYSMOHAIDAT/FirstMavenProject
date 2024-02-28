package step_definitions;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utiles.BrowserUtils;
import Utiles.DataReader;
import Utiles.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CrateSecondPage;
import pages.CraterLoginPage;
import pages.crater_item_add_page;
import pages.crater_item_input_page;


public class CraterDemoTest {
	
	
	CraterLoginPage log_p=new CraterLoginPage();
	BrowserUtils utils=new BrowserUtils();
	CrateSecondPage crater_2_p=new CrateSecondPage();
	crater_item_input_page item_p= new crater_item_input_page();
	crater_item_add_page item_A=new crater_item_add_page();
	
	@Given("As an entity user, I am logged in")
	public void as_an_entity_user_i_am_logged_in() throws InterruptedException {
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().get(DataReader.getProperty("crater_url"));
		log_p.email.sendKeys(DataReader.getProperty("crater_email"));
		log_p.pass.sendKeys(DataReader.getProperty("crater_pass"));
		log_p.logBTN.click();
		Thread.sleep(2000);
	    
	}

	@Given("I navigate to Items tab")
	public void i_navigate_to_items_tab() throws InterruptedException {
		crater_2_p.items.click();
		Thread.sleep(2000);
		
	}

	@When("I click on the Add Item button")
	public void i_click_on_the_add_item_button() throws InterruptedException {
		crater_2_p.Additems.click();
		Thread.sleep(2000);
	}
	
	

	@Then("I should be on item input page")
	public void i_should_be_on_item_input_page() {
		Assert.assertTrue(item_p.address.isDisplayed());
	}

	@When("I provide item information name {string}, price {string}, unit {string}, and description {string}")
	public void i_provide_item_information_name_price_unit_and_description(String string, String string2, String string3, String string4) throws InterruptedException {
		{	
		item_p.Name.sendKeys("Name");
		item_p.price.sendKeys("1800");
		Thread.sleep(2000);
		item_p.description.sendKeys("description");
		item_p.Unit.sendKeys("pc"+ Keys.ENTER);
		Thread.sleep(2000);
		
		

	}
	}

	@When("I click Save Item button")
	public void i_click_save_item_button() {
		item_p.save.click();
	}

	
//////////////////////////////////////////////////////////////	/////////////////////////////////////////////////////////
	@Then("The Item is added to the Item list table")
	public void the_item_is_added_to_the_item_list_table() {
		Assert.assertTrue(item_A.NameADD.isDisplayed());
	}
//////////////////////////////////////////////////////////////////////////
	
	
	@Then("I delete the item")
	public void i_delete_the_item() throws InterruptedException {
		item_A.threeDot.click();
		Thread.sleep(2000);
//		item_A.delete.click();
	}

	@When("I select the item {string}")
	public void i_select_the_item(String string) {
	 
	}

	@When("I should be on item details page")
	public void i_should_be_on_item_details_page() {
	   
	}

	@When("I update the item price to {int} dollars")
	public void i_update_the_item_price_to_dollars(Integer int1) {
	   
	}

	@When("I click Update Item button")
	public void i_click_update_item_button() {
	    
	}

	@Then("The Item price is updated to {int} dollars")
	public void the_item_price_is_updated_to_dollars(Integer int1) {
	  
	}



	
	
	
	

	




//}
//
//
//
//
//
//@Then("I should be on item input page")
//public void i_should_be_on_item_input_page() {
//
//}
//
//@When("I provide item information name {string}, price {string}, unit {string}, and description {string}")
//public void i_provide_item_information_name_price_unit_and_description(String string, String string2, String string3, String string4) {
// 
//}
//
//@When("I click Save Item button")
//public void i_click_save_item_button() {
//  
//}
//
//@Then("The Item is added to the Item list table")
//public void the_item_is_added_to_the_item_list_table() {
//    
//}
//
//@Then("I delete the item")
//public void i_delete_the_item() {
// 
//}

}
