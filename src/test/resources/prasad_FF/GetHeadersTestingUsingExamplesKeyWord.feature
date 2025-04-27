Feature: validate response headers

Scenario: 1.Response should get multiple books data
Given Hit books API
Then Validate headers "<headerParameter>" and its value "<value>"
Examples:
| headerParameter									|	value																										|
|	Server																				| nginx/1.17.10 (Ubuntu)								|
|	Content-Type												| application/json; charset=utf-8						|
|	Content-Length										| 4514 						|
|	Connection															| keep-alive						|
|	X-Powered-By												| Express							|
|	ETag																						| W/\"11a2-8zfX++QwcgaCjSU6F8JP9fUd1tY\"								|
