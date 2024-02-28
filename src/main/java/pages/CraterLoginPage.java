package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiles.Driver;

public class CraterLoginPage {
	
	
	
	public CraterLoginPage()
	{
			PageFactory.initElements(Driver.getDriver(), this);		
	}
		
		
		@FindBy (xpath="//input[@name='email']")
		public WebElement email;
		
		@FindBy(xpath="//input[@name='password']")
		public WebElement pass;
		
		
		@FindBy (xpath="//button[@type='submit']")
		public WebElement logBTN;
		
		

		
		
		
		
		
	

}


