package bank.UnitSteps;

import bank.methods.SeleniumOpeations;

public class StepExecutor 
{
	
	
	public static void main(String[]args)
	{
		//browser Launch
		Object[]input=new Object[2];
		input[0]="Chrome";
		input[1]="D:\\5.30 pm pravin sir batch bank\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
		SeleniumOpeations.browserLaunch(input);
		
		//applicationLaunch
		Object[]input1=new Object[1];
		input1[0]="http://primusbank.qedgetech.com/";
		SeleniumOpeations.applicationLaunch(input1);
		
		//Enter username
		Object[]input2=new Object[2];
		input2[0]="//*[@id='txtuId']";
		input2[1]="Admin";
		SeleniumOpeations.sendKey(input2);
		
		//Enter password
		Object[]input3=new Object[2];
		input3[0]="//*[@id='txtPword']";
		input3[1]="Admin";
		SeleniumOpeations.sendKey(input3);
		
		//click on login
		Object[]input4=new Object[1];
		input4[0]="//*[@id='login']";
		SeleniumOpeations.click(input4);
		
		
		//Click on branches
		Object[]input5=new Object[1];
		input5[0]="//*[@src='images/Branches_but.jpg']";
		SeleniumOpeations.click(input5);
		
		//select country
		Object[]input6=new Object[2];
		input6[0]="//*[@id='lst_countryS']";
		input6[1]="INDIA";
		SeleniumOpeations.dropDown(input6);
		
		//select state
		Object[]input7=new Object[2];
		input7[0]="//*[@id='lst_stateS']";
		input7[1]="Andhra Pradesh";
		SeleniumOpeations.dropDown(input7);
		
		// select city
		Object[]input8=new Object[2];
		input8[0]="//*[@id='lst_cityS']";
		input8[1]="Hyderabad";
		SeleniumOpeations.dropDown(input8);
		
		// click on search
		Object[]input9=new Object[1];
		input9[0]="//*[@id='btn_search']";
		SeleniumOpeations.click(input9);
		
	

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
