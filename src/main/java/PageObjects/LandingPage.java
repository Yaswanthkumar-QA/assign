package PageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By text=By.cssSelector(".gLFyf.gsfi");
	By gmaillink=By.xpath("//*[@id='rso']/div[1]/div[1]/div/div[1]/a/h3");
	By signin=By.xpath("//div[@class='h-c-header__cta']/ul[1]/li[2]");

	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	
	
	public WebElement getText()
	{
		return driver.findElement(text);
		//LoginPage login=new LoginPage(driver);
		//return login;
	}
	public WebElement getGmailLink()
	{
		return driver.findElement(gmaillink);
		//LoginPage login=new LoginPage(driver);
		//return login;
	}
	public LoginPage getSignin()
	{
		driver.findElement(signin).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver=driver.switchTo().window(childId);	
		LoginPage login=new LoginPage(driver);
		return login;
	}



	
	

}
