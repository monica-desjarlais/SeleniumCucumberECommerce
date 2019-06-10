@CompareProducts 
Feature: Compare Products 

Scenario: Check if you are able to compare two products 
	Given Initialize the browser with chrome 
	And  Navigate to "http://live.guru99.com" 
	Given click on mobile menu 
	When click on add to compare for two mobiles 
	When  click on compare button 
	Then verify the products are reflected in the popup window 
	And close browser 
	
	
	
	
	
	
	
