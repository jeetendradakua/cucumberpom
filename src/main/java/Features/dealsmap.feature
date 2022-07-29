Feature: Deal data creation 

Scenario: Free CRM Create a new deal scenario 

	Given user is already on Login Page 
	When title of login page is Cogmento CRM 
	Then user enters username and password 
		| username | password |
		|jeetendradakua@gmail.com | Java@123 |
	Then user clicks on login button 
	Then user is on home page 
	Then user moves to new deal page 
	Then user enters deal details 
		|title|amount|probability|commission|
		|test deal1|10000|56|500|
		|test deal2|10047|14|500|
		|test deal3|30000|75|3000|
		|test deal4|46555|47|500|
	
	Then user close the browser