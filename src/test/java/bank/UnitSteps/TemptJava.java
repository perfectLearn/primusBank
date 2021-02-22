package bank.UnitSteps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TemptJava 
{
	
	public static void main(String[] args)
		{
			
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "D:\\5.30 pm pravin sir batch bank\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe");    		
		ChromeDriver driver=new ChromeDriver();                                                       //browser Launch
		
		//open Application		
		driver.get("http://primusbank.qedgetech.com/");       //1                              // openApplication
						
		// enter username
		driver.findElementByXPath("//*[@id='txtuId']").sendKeys("Admin");   //2        // sendkey method
			
		//enter password
		driver.findElementByXPath("//*[@id='txtPword']").sendKeys("Admin");
			
		//click on Login button
		driver.findElementByXPath("//*[@name='login']").click();     //1                       //click method 
		
		//click on branches
		driver.findElementByXPath("//*[@src='images/Branches_but.jpg']").click();
		
		//select india as country
		
		Select country=new Select(driver.findElementByXPath("//*[@name='lst_countryS']"));         //2             //static dropdown
		
		       country.selectByVisibleText("INDIA");
		//select AP as state
		       Select state=new Select(driver.findElementByXPath("//*[@name='lst_stateS']"));
				
		       state.selectByVisibleText("Andhra Pradesh");
      
		//select Hyderabad as city
		       Select city=new Select(driver.findElementByXPath("//*[@name='lst_cityS']"));
				
		       city.selectByVisibleText("Hyderabad");   
		
		//click on Search button
		       driver.findElementByXPath("//*[@id='btn_search']").click();
		
		
		
		
		
		
		
		
			
			
		}
	
	
	
	

}
