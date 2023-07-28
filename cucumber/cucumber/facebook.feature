
Feature:login
Background:
Given Url:"https://www.facebook.com/"
Then facebook loginpage is opened succesfully
 
Scenario: Validate login with valid credentials
Given  Valid UserName "7993169534"
Then UserName entered successfully
Given Valid Password "Renu@ammu123"
Then password entered successfully
And click on login button
Then dashboard opened succesfully














