Feature: Testing for books get api
 
Scenario: 1.Response should get multiple books data
  Given Hit books API
  Then Validate API returns multiple books json
 
Scenario: 2.Validate single book json should have title value as Git Pocket Guide
  Given Hit books API
  Then Validate attribute at json path "books[0].title" and its value "Git Pocket Guide"
  
Scenario: 3.Verify isbn attribute have numbers only (not any character)
  Given Hit books API
  Then Verify "books[1].isbn" attribute have numbers only
  
Scenario: 6.if end point is not correct (typing mistake, like books) it should not return data
  Given If end point is not correct
  
Scenario: 7.Verify total 9 attributes are present for each book 
Scenario: 7.Validate json path {string} and confirm that there are total 9 attributes present 
  Given Hit books API
  Then Validate json path "books[0].title" and confirm that there are total 9 attributes present
 
Scenario: 8.Page attribute should be a number (not a character)
  Given Hit books API
  #Then "pages" attribute should be a number
  Then Verify "books[1].pages" attribute have numbers 
  
Scenario: 9.Website attribute value should shart with "http://" and end with "index.html"
  Given Hit books API
  Then "website" attributes value should start with "http://" and end with "index.html"
  
Scenario: 10.Verify all 8 books should not be blank with 9 attributes
  Given Hit books API
  Then Verify all 8 books should not be blank with 9 attributes
  
Scenario: 11.verify date format "YYYY-MM-DDThh:mm:ss.000Z"
  Given Hit books API
  Then verify date format "\d{4}-\d{2}-\d{2}T\d{2}:\d{2}:\d{2}\.\d{3}Z"
  
Scenario: 12.Validate that "No starch Press" publisher has only 2 books namely “Eloquent JavaScript, Second Edition” and “Understanding ECMAScript 6”
  Given Hit books API
  Then Validate that "No Starch Press" publisher has only 2 books namely "Eloquent JavaScript, Second Edition" and "Understanding ECMAScript 6"
  
Scenario: 13.Validate that 'O\'Reilly Media' publisher is not the publishing any book for author 'Nicholas C. Zakas'
	Given Hit books API 
	Then 'O\'Reilly Media' publisher is not the publishing any book for author 'Nicholas C. Zakas'
	
Scenario: 14.Validate that 'O\'Reilly Media' publisher has 6 books only
	Given Hit books API 
	Then 'O\'Reilly Media' publisher should have exactly 6 books
