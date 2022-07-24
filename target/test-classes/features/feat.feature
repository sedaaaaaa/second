
@SEDA

Feature: Validate Techfios Login Functionality

Scenario Outline: Login with valid credentials 

Given User is on techfios login pages
When User should enter "<usernamee>" and "<passwordd>"
When User clicks on signin button 
Then User should land on dashboard page


Examples:
|usernamee        	|passwordd |
|demo@techfios.com	|abc123      |