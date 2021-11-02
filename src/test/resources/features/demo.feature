Feature: Take survey demo

Scenario: User answer the survey
  Given User go to surveymonkey page
  When User select "Bad" and submit the answer
  Then User should see "Have a nice day." message