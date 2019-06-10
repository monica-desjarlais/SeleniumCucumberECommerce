@AddCart 
Feature: Add Cart Validation 

Scenario: 
	Check if you cannot add more products in cart than products available in the store 
	Given Initialize the browser with chrome 
	And  Navigate to "http://live.guru99.com" 
	Given click on "mobile" menu 
	Given  click on add to cart menu for xperia mobile 
	When change qty value to "1000" 
	When  click on update button 
	Then verify the error message is displayed 
	When click on empty card link 
	Then verify the error message is displayed for empty card 
	And close browser 
	
	
	
	
	
	
	
