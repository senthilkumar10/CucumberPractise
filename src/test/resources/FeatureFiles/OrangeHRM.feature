@WebTC
Feature: This is the Login feature for Orange HRM
Scenario: A valid user should be able to login Orange HRM
	Given the login page of Orange HRM is launched
	When the user enters the valid userName and Password
	And clicks the login button
	Then the user should be navigated to home page