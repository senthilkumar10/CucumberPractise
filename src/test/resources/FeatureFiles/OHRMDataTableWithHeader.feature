@WebTC
Feature: This is the Login feature for Orange HRM test
Scenario: This is Login Scenario
	Given Login to Orange HRM
	When Input UN and Password as below
	|UserName| Password|
	|Admin 	 | admin123|
	And Click on the Login button to land Home Page
	