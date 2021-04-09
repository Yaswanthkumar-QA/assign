package Task;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;


import PageObjects.LandingPage;

import resource.base;



public class HomePage extends base {
	public WebDriver driver;
	
	
	@BeforeTest
	public void intializeBrowser() throws IOException
	{
		driver=initializeDriver();
		
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	@Test
	public void homePageValidation() throws IOException
	{
		//Creating object to that class and invoke methods of it
		
		LandingPage land=new LandingPage(driver);
		land.getText().sendKeys("gmail.com");
		land.getText().submit();
		land.getGmailLink().click();
		land.getSignin();
		
	}
	

	@AfterTest
	public void teardown()
	{
		
		driver.close();
	}
	

	

}
