package FirstCry_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import FirstCry_StepDef.FirstCry_StepDef;
import groovy.transform.VisibilityOptions;

public class HomePage
{ 
	
	
	
	//@FindBy(linkText="All Categories")
	@FindBy(xpath="//div[@class='menu-container']/descendant::li[1]")
	public WebElement all_Catagory;
	
	@FindBy(linkText="GIRL FASHION")
	public WebElement girl_Fashion;
	
	@FindBy(xpath="//div[@id='maindiv']/descendant::a[1]/img")
	public WebElement Produt_Image;
	
	
	
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}


public void navigate_All_Categories(WebDriver driver)
{
	Actions action= new Actions(driver);
	action.moveToElement(all_Catagory).build().perform();
}

public void validate_All_Categories()
{
	if(girl_Fashion.isDisplayed())
	{
		Assert.assertTrue(true);
	}
}
//
//public void select_Category() 
//{
//	
//	girl_Fashion.click();
//}



}
