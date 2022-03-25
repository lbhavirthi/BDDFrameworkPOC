Feature: Signup button with less password characters

  Scenario: Validate signup button with less password characters
    Given Open the Chrome browser and launch Facebook Signup page
    When Enter the required fileds with password length less than 6 characters
    | FirstName|SurName| MobileNumber|Password|Day|Month|Year|
		|John 		|Campbell | 9618675723 | test 	|29 | 12 	|1988|
    Then Validate invalid password Error message 	‘Your password must be at least 6 characters long. Please try another.’
