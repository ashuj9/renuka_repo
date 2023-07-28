Feature: Login page

Background:Open Login page

Given URL : "https://www.facebook.com/login.php"

Then On search FaceBook Login page should be displayed

Scenario:Validate login with valid username and password

Given username "7993169534"
Then username entered succesfully
Given password "Renu@ammu123"
Then password entered successfully
And click Login Button
Then FaceBook home page should be displayed


Scenario:Validate login with invalid username and password

Given username "7959995344"
Then username entered succesfully
Given password "Renu@a6u123"
Then password entered successfully
And click Login Button
Then "invalid credentials" should be shown 


Scenario:Validate login with empty username and password

Given username " "
Then username entered succesfully
Given password " "
Then password entered successfully
And click Login Button
Then " can't be empty" should be shown 