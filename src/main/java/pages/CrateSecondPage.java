package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiles.Driver;

public class CrateSecondPage {
	public  CrateSecondPage()
	{
		PageFactory.initElements(Driver.getDriver(), this);		
		
     }


@FindBy (xpath="//a[text()=' Items']")
public WebElement items;



@FindBy (xpath="//*[text()=' Add Item']")
public WebElement Additems;



//   /html/body/div/main/div/div/div[1]/div[2]/div/button[2]

}