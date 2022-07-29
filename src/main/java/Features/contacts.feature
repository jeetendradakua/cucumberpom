Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given user is already on Login Page
When title of login page is Cogmento CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then user saves the new contact details
Then Close the browser

Examples:

      |username|password|firstname|lastname|position|
      |jeetendradakua@gmail.com|Java@123|Tom|Peter|Engineer|
      |jeetendradakua@gmail.com|Java@123|David|Dsuza|Director|