
Feature: testing for books get adv api
 

Scenario: 1.Validate single book json should have title value as Git Pocket Guide
  Given Hit books API
  Then Validate attribute at json path "books[XX].title" and its value "Git Pocket Guide11"
  