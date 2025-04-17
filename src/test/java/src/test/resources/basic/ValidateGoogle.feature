Feature: google website validation
 
  Scenario: 1.Verify that google website is up
  	Given Prepare URL
    When hit google Site should open and accessible
    Then Check valid status code 200 OK
    
    Scenario: 2.Verify that google website is up
  	Given Prepare URL
    When hit google Site should open and accessible
    Then Check valid status code 300 OK
    
    
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
   #Scenario: verify search funcationality of google
    #Given Open browser
    #When hit google Site should open and accessible
    #When I search with automation word
    #Then I should get multip search results
    #
    #Scenario: Verify that amazon website is up
    #Given Open browser
    #When hit amazon Site should open and accessible
    #Then Check valid status code - 200OK
    #
     #Scenario: Verify that irctc website is up
    #Given Open browser
    #When hit irctc Site should open and accessible
    #Then Check valid status code - 200OK