package Task;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resource.base;



public class LoginTest extends base {
	public WebDriver driver;
	
	
	@BeforeTest
	public void intializeBrowser() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	
	@Test
	public void loginPageValidation() throws IOException, InterruptedException
	{
		//Creating object to that class and invoke methods of it
		
		
		
		LandingPage land=new LandingPage(driver);
		land.getText().sendKeys("gmail.com");
		land.getText().submit();
		land.getGmailLink().click();
		LoginPage login=land.getSignin();
		login.getEmail().sendKeys("automationproject123");
		login.getNext().click();
		Thread.sleep(3000);
		login.getPassword().sendKeys("automation123@");
		login.getSubmit().click();
		
		Thread.sleep(10000);
		driver.quit();
	}
	
	

	

}
