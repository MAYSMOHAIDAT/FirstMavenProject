package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiles.Driver;

public class ebay_page_1 {
	
	public ebay_page_1()

	{
		PageFactory.initElements(Driver.getDriver(), this);		
		
     }
	
	@FindBy (xpath="//img[@id='gh-logo']")
	public WebElement logo_singin;
	
	@FindBy (xpath="//input[@type='text']")
	public WebElement search_box;
	
	@FindBy (xpath="//input[@type='submit']")
	public WebElement search_btn;
	
}
