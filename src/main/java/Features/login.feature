Feature: Free CRM Login Feature

#without Examples Keyword
#Scenario: Free CRM Login Test Scenario

#Given user is already on Login Page
#When title of login page is Cogmento CRM
#Then user enters "jeetendradakua@gmail.com" and "Java@123"
#Then user clicks on login button
#Then user is on home page
#Then close the browser

#with Examples keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Cogmento CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then close the browser

Examples:
    | username | password |
    | jeetendradakua@gmail.com | Java@123|
    | jeetendradakua24@gmail.com | Java@123|
