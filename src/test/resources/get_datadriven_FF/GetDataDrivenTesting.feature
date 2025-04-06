Feature: testing1 for books get with dtadriven approach 

Scenario: 1.Validate below attributes and its value matching
  Given Hit books API
  Then Validate attribute at json path <jsonPathValue> and its value <valueTobeVerified>
Examples:
	| jsonPathValue						|	valueTobeVerified															|
	|	'books[XX].author'			|	'Glenn Block et al.'													|
	|	'books[XX].title'				|	'Git Pocket Guide'														|
	|	'books[XX].subTitle'		|	'A JavaScript and jQuery Developer\'s Guide'	|
	|	'books[XX].publisher'		|	'O\'Reilly Media'															|


  
  
  
  
  