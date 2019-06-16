Feature: This is the Login feature for Orange HRM
Scenario: This is Login Scenario
	Given You are on the Login Page
	When You enter the below credentials 
	|Admin | admin123|
	And click the login button
	Then You should see the home page