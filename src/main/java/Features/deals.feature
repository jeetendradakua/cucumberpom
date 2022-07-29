Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given user is already on Login Page
When title of login page is Cogmento CRM
Then user enters username and password
|jeetendradakua@gmail.com|Java@123|
Then user clicks on login button
Then user is on home page
Then user moves to new deal page
Then user enters deal details
|test deal|10000|56|500|
Then user saves the new contact details
Then user close the browser