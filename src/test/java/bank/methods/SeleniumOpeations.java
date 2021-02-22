package bank.methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOpeations
{

	public static WebDriver driver=null;
	                      
	public static Hashtable<String,Object>  outputParameters=new Hashtable<String,Object>();
	
	//browser launch
	public static Hashtable<String,Object> browserLaunch(Object[] inputParameters)
	{
		try
		{
		String strBrowserName=(String) inputParameters[0];
		String webDriverExePath= (String) inputParameters[1];
	
	if(strBrowserName.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", webDriverExePath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	else if(strBrowserName.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", webDriverExePath);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		
	}
	
	
	outputParameters.put("STATUS", "PASS");	   
	outputParameters.put("MESSAGE", "Method Used: browserLaunch, Input Given : " +inputParameters[0].toString());	     
	
	
		}
		
	catch(Exception e)
		{
		outputParameters.put("STATUS", "FAIL");	   
		outputParameters.put("MESSAGE", "Method Used: browserLaunch, Input Given : " +inputParameters[0].toString());	     
		
		
		}
		return outputParameters;
	}
	
	//Application launch
	public static Hashtable<String,Object> applicationLaunch(Object[]inputParameters)
	{
		try
		{
		String strgURL= (String)inputParameters[0];
			driver.get(strgURL);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			
			outputParameters.put("STATUS", "PASS");	   
			outputParameters.put("MESSAGE", "Method Used: applicationLaunch, Input Given : " +inputParameters[0].toString());	     
			
			
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");	   
			outputParameters.put("MESSAGE", "Method Used: applicationLaunch, Input Given : " +inputParameters[0].toString());	     
			
		}
		return outputParameters;
	}
	
	//send key
	public static Hashtable<String,Object> sendKey(Object[]inputParameters)
	{
		try
		{
		String xpath=(String)inputParameters[0];
		String value=(String)inputParameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement obj=driver.findElement(By.xpath(xpath));
				   obj.clear();
				   obj.sendKeys(value);
				   
			outputParameters.put("STATUS", "PASS");	   
			outputParameters.put("MESSAGE", "Method Used: sendKey, Input Given : " +inputParameters[1].toString());	     
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");	   
			outputParameters.put("MESSAGE", "Actions: sendKey, Input Given : " +inputParameters[1].toString());	
		}
		
		return outputParameters;
	}
	
	//click
	public static Hashtable<String,Object> click(Object[]inputParameters)
	{
		try
		{
		String xpath=(String)inputParameters[0];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement obj1=driver.findElement(By.xpath(xpath));
				   obj1.click();
				   
				   outputParameters.put("STATUS", "PASS");	   
					outputParameters.put("MESSAGE", "Method Used: click, Input Given : " +inputParameters[0].toString());	     
					
		}
		catch(Exception e)
		{
			 outputParameters.put("STATUS", "FAIL");	   
				outputParameters.put("MESSAGE", "Method Used: click, Input Given : " +inputParameters[0].toString());
		}
		
		return outputParameters;
	}
	
	//dropdown
	public static Hashtable<String,Object> dropDown(Object[]inputParameters)
	{
		try
		{
		String xpath=(String)inputParameters[0];
		String name=(String)inputParameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Select sel=new Select(driver.findElement(By.xpath(xpath)));
		sel.selectByVisibleText(name);
		 outputParameters.put("STATUS", "PASS");	   
			outputParameters.put("MESSAGE", "Method Used: dropDown, Input Given : " +inputParameters[1].toString());
		
		}
		catch(Exception e)
		{
			 outputParameters.put("STATUS", "PASS");	   
				outputParameters.put("MESSAGE", "Method Used: dropDown, Input Given : " +inputParameters[1].toString());
		}
		
		return outputParameters;
	}
}
