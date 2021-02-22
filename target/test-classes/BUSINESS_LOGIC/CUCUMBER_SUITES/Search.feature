Feature: Search Feature

Background: user is successfully logged in
Given user opens "chrome" browser with exe "D:\\5.30 pm pravin sir batch bank\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
Given user enters url "http://primusbank.qedgetech.com/"
When user enters "Admin" as username
When user enters "Admin" as password
When user click on login button


@RegressionTest
Scenario: Search functionality
When user click on branches
When user select "INDIA" as country
When user select "Andhra Pradesh" as state
When user select "Hyderabad" as city
When user click on search button
Then application shows list of branches from "Hyderabad" city




 





