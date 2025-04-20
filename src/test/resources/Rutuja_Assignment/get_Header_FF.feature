Feature: validate response headers
 

Scenario: 1.Validate headers
  Given Hit books API
  Then Validate headers as key and its values
 |connection		    |keep-alive			   										  	| 
 |Server				   	|nginx/1.17.10 (Ubuntu)     	  					|
 #|date		  			  |Sat, 12 Apr 2025 18:17:12 GMT			    	| 
 |etag					    |W/"11a2-8zfX++QwcgaCjSU6F8JP9fUd1tY"			| 
 |x-powered-by		  |Express			    												| 
 
 