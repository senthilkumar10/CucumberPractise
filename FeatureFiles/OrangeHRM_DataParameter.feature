Feature: This is the Login feature for Orange HRM
Scenario: A valid user should be able to login Orange HRM
	Given the login page of Orange HRM is launched successfully
	When the user enters the valid credentials "Admin" and "admin123"
	And clicks the login button successfully
	Then the user should be navigated to home page successfully