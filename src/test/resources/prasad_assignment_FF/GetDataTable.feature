Feature: Testing for books using DataTable

  Scenario: Validate below attributes and its value
    Given Hit books API
    When I send Get request to "/BookStore/v1/Books"
    Then Validate attribute at json Path and its value 
      | books[0].author    		| Richard E. Silverman  				 |
      | books[0].title     				| Git Pocket Guide       						|
      | books[0].subTitle  		| A Working Introduction 			|
      | books[0].publisher | O'Reilly Media       									|
    

