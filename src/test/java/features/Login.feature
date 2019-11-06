Feature: User login

Scenario: A valid user attempts to login
Given the user is on the login page
When the user provides a valid email and password combo
And clicks on the login button
Then the user should be presented with the members page