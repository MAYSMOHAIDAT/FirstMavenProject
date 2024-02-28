package step_definitions;
import org.junit.Assert;
import Utiles.DataReader;
import Utiles.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ebay_page_1;
import pages.ebay_page_2;

public class ebay_demo{
	
	ebay_page_1 e1=new ebay_page_1();
	ebay_page_2 e2=new ebay_page_2();
	@Given("verify user in ebay search page")
	public void verify_user_in_ebay_search_page() {
	   	Driver.getDriver().get(DataReader.getProperty("ebay_url"));
		 Assert.assertTrue(e1.logo_singin.isDisplayed());
		 Assert.assertTrue(e1.search_box.isDisplayed());
	}
	@When("search testdata {string}")
	public void search_testdata(String testdata) {
	 e1.search_box.sendKeys(testdata);
	 e1.search_btn.click();  
	}
	@Then("get text for search criteria text element")
	public void get_text_for_search_criteria_text_element() {
	e1.search_box.getText();
	}
	@Then("verify it matches the search input")
	public void verify_it_matches_the_search_input() 
	{
	   if(e2.search_result.getText().contains(e1.search_box.getText()));
}
}