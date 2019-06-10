@CouponValidation 
Feature: Discount Coupon Validation 

Scenario Outline: Check if the discount coupon works correctly 
	Given Initialize the browser with chrome 
	And  Navigate to "http://live.guru99.com" 
	And enter <username> and <password> and logs in 
	Given click on mobile link 
	And  add iphone to cart 
	When enter coupon code 
	Then verify the error discount is generated 
	And close browser 
	
	Examples: 
		|username			|password	|
		|monicalauraburns@yahoo.com	|test123	|
		
		
		
		
