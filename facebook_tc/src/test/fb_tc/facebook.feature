Feature: login
Background:
Given Url: "https://www.facebook.com/"
Then facebook login page is opened sucessfully

Scenario: Validate login with valid credentials
Given valid UserName "7993169534"
Then UserName entered sucessfully
Given valid Password "Renu@ammu123"
Then Password entered sucessfully
And click on login button
Then dashboard page is displayed sucessfully
