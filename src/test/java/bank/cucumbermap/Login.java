package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOpeations;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login 
{

	
	@Given("^user opens \"([^\"]*)\" browser with exe \"([^\"]*)\"$")
	public void openBrowser(String bname, String exe) throws Throwable 
	{
		Object[]input=new Object[2];
		input[0]=bname;
		input[1]=exe;
		SeleniumOpeations.browserLaunch(input);
		
	}

	@Given("^user enters url \"([^\"]*)\"$")
	public void urlOpen(String url) throws Throwable
	{
		Object[]input1=new Object[1];
		input1[0]=url;
		SeleniumOpeations.applicationLaunch(input1); 
	}

	@When("^user enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String uname) throws Throwable 
	{
	   
		Object[]input2=new Object[1];
		input2[0]=uname;
		Hashtable<String, Object>  output2 = SeleniumOpeations.sendKey(input2);
		
			
	HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(), "^user enters \"([^\"]*)\" as username$", output2.get("MESSAGE").toString());	
		
	}

	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String pass) throws Throwable
	{
		Object[]input3=new Object[1];
		input3[0]=pass;
		Hashtable<String, Object>  output3 = SeleniumOpeations.sendKey(input3);		
	HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "user enters \"([^\"]*)\" as password", output3.get("MESSAGE").toString());	
		
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable
	{
	    
	}

	@Then("^user is on \"([^\"]*)\" page$")
	public void user_is_on_page(String arg1) throws Throwable 
	{
	   
	}

	
              
                
	
}

