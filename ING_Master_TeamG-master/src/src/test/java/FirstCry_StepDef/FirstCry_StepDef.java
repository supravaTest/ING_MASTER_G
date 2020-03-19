package FirstCry_StepDef;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import FirstCry_Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstCry_StepDef
{
	public WebDriver driver;
	public Properties property;
	public HomePage hp;
	//public WebDriverWait wait=new WebDriverWait(driver,20);


	@Before
	public void initialization() throws IOException
	{
			
			property = new Properties();
			FileInputStream ip = new FileInputStream("./src/test/resources/FirstCryConfig/FirstCryConfig.properties");
			property.load(ip);
			
	}
		
	
	@Given("launch the firstcry URL")
	public void launchBrowser()
	{
		String browsers=property.getProperty("browser");
		
		if(browsers.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if (browsers.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
		}
		hp=new HomePage(driver);
		driver.manage().window().maximize();
		driver.get(property.getProperty("URL"));
		
	}
	
	

	@Then("Validate the browser launched successfully")
	public void validate_the_browser_launched_successfully()
	{
		if(driver.getTitle().contains("firstcry"))
		{
			Assert.assertTrue(true);
		}
	}

	@When("Navigate to {string} link")
	public void navigate_to_link(String string) 
	{
		//wait.until(ExpectedConditions.visibilityOf(hp.all_Catagory));
		hp.navigate_All_Categories(driver);
	}
	
	@Then("All the categories should be visible")
	public void all_the_categories_should_be_visible() 
	{
	    hp.validate_All_Categories();
	}
	

	@When("User should select the preferred category {string}")
	public void user_should_select_the_preferred_category(String string)  
	{
	    
	}
	
	
	
	
	/*@After
	public void closeBroser()
	{
		driver.close();
	}*/
}
