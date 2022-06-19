Feature: Application Login

Scenario: Create Account with proper information
Given Open any Browser
And Navigate to Signup Page
When User enters firstname as "Rishikesh" and lastname as "Pawar" and email as "rishikeshpawar007" and password as "Rishi@007" and birthyear as "1997" into the fields
And User clicks on submit button
Then Verify user is able to successfully signup
