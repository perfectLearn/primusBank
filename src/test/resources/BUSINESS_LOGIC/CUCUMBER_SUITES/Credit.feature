Feature: Credit Feature

Background: user is successfully logged in
Given user open "chrome" browser with exe "D:\\5.30 pm pravin sir batch bank\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
Given user enter url "http://primusbank.qedgetech.com/"


@SmokeTest
Scenario: Login functinality for valid username and valid password
When user enters "Admin" as username
When user enter "Admin" as password
When user click on login button
Then user is on "Admin" page





