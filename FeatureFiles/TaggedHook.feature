@TaggedHooks
Feature: Test Tagged Hooks

@First
Scenario: This is First Scenario
	Given this is first step
	When this is second step
	Then this is third step

@Second
Scenario: This is Second Scenario
	Given this is first step
	When this is second step
	Then this is third step
	
@Third
Scenario: This is Third Scenario
	Given this is first step
	When this is second step
	Then this is third step	
