package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By email=By.id("identifierId");
	By next=By.cssSelector(".VfPpkd-RLmnJb");
	By password=By.xpath("//input[@type='password']");
	
	By submit=By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]");
	

	//Constructor
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
		
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement getNext()
	{
		return driver.findElement(next);
		
	}
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
		
	}
	
	
	
	

}
