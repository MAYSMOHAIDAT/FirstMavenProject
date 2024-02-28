package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiles.Driver;

public class ebay_page_2 {
	public ebay_page_2()
	{
		PageFactory.initElements(Driver.getDriver(), this);			
     }

	@FindBy (css=".srp-controls__count-heading")
	public WebElement search_result;

}


