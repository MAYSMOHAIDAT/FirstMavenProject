package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiles.DataReader;
import Utiles.Driver;

public class crater_item_input_page {
	{
		PageFactory.initElements(Driver.getDriver(), this);		
		
     }
	
	@FindBy (css=".text-2xl")
	public WebElement address;
	
	
	@FindBy (xpath="/html/body/div/main/div/div/form/div/div/div/div[1]/div/div/input")
	public WebElement Name;
	
	//*[local-name()='input'and@fdprocessedid='7k2d8t']
	
	@FindBy (xpath="//*[@id=\"0\"]")
	public WebElement price;
	
	
	@FindBy (xpath="/html/body/div/main/div/div/form/div/div/div/div[3]/div/div/input")
	public WebElement Unit;
	

	@FindBy (xpath="/html/body/div/main/div/div/form/div/div/div/div[3]/div/div/div[2]/div[1]/ul/li[10]")
	public WebElement unit_pc;
	
	
	@FindBy (xpath="//textarea[@name='description']")
	public WebElement description;
	
	
	@FindBy (xpath="//button[@type='submit']")
	public WebElement save;
	
	
	
}



