@Login
Feature: Login into Application

Scenario Outline: Validating login 
Given Initialize the browser with chrome
And Navigate to "http://live.guru99.com" 
When User enters <username> and <password> and logs in
Then Verify user is logged in or error message displays
And close browser

Examples:
|username			|password	|
|monicalauraburns@yahoo.com	|test123	|
|monicalauraburns@yahoo.com	|wrongpass      |






