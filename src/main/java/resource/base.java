package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		//chrome
		//firefox
		//IE
		prop=new Properties();
		FileInputStream fis=new FileInputStream("F:\\work\\Software Installed\\eclipse\\eclipse_workspace\\assign\\src\\main\\java\\resource\\data.properties");
		prop.load(fis);
		//mvn test -Dbrowser=chrome
		//String browserName=System.getProperty("browser");
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome"))
		{
			//execute in chrome driver
			System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName=="firefox")
		{
			//execute in firefox driver
			System.setProperty("webdriver.firefox.driver", "F:\\work\\WebDriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName=="msedge")
		{
			//execute in edge driver
			System.setProperty("webdriver.edge.driver", "F:\\work\\WebDriver\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	
}
