Feature: LeaftTaps login functionality

Background:
Given open the chrome browser
And Load the application url

Scenario Outline: Login with positive credential
And Enter the username as <username>
And Enter the password as <password>
Then Click on Login Button
Then Homepage should be displayed
#When Click on CRMSFA link
#Then MyHomePage should be displayed

Examples:
 |username|password|
 |'Demosalemanger'|'crmsfa'|
 |'DemoCSR'|'crmsfa'|
 
 Scenario: Login with negative credential
And Enter the username as 'Demo'
And Enter the password as 'crmsfa'
Then Click on Login Button
But Error should be displayed
 
 #Scenario: Login with negative credential
#Given Enter the username as 'Demo'
#And Enter the password as 'crmsfa'
#When Click on Login button
#But Error message should be displayed