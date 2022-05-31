Feature: LeaftTaps create leadlogin functionality
Background:
Given open the chrome browser
And Load the application url

Scenario: Login with positive credential
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
Then Click on Login Button
Then Homepage should be displayed
When Click on CRMSFA link
Then MyHomePage should be displayed