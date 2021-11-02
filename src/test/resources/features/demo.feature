Feature: Take survey demo

Scenario: User answer the survey
  Given User go to survey page
  When User select "Good" and submit the answer
  Then User should see "Have a nice day." message