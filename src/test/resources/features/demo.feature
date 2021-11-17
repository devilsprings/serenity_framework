Feature: Take survey demo

Scenario: User answer the survey
  Given I go to survey page
  When I select Good
  And I submit the answer
  Then I should see "Have a nice day." message