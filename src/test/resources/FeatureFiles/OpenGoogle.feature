Feature: This is to test Google search
Scenario: Google Search scenario
	Given User is entering google.com
	When user is typing the search term "Dumbo"
	And enters the return key
	Then the user shoulld see the search results