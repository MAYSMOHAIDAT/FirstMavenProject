package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiles.Driver;

public class crater_item_add_page {

		{
			PageFactory.initElements(Driver.getDriver(), this);		
			
	     }

		
		@FindBy (xpath="/html/body/div/main/div/div/form/div/div/div/div[1]/div/div/input")
		public WebElement NameADD;
		
		
		
		@FindBy (xpath="//button[@id='headlessui-menu-button-5']")
		public WebElement threeDot;
		

		
}