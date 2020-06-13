@WebTC
Feature: This is the Login feature for Orange HRM test
Scenario Outline:: This is Login Scenario
	Given Proceed to Login
	When User enters "<UserName>" and Password "<Password>"
	And Clicked button
	Then Home page Landed
	

Examples:
|UserName| Password|
|Admin 	 | admin123|
|Admin 	 | admin123|