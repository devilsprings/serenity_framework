Feature: Take survey demo

  Scenario: User answer the survey
    Given I go to survey page
    When I select "Good"
    And submit the answer
    Then I should see "Have a nice day." message
    When I go to previous page
    Then Button "Good" should be clicked
    And Button "Bad" should not be clicked
    And Button "Okay" should not be clicked
    When I select "Bad"
    And submit the answer
    Then I should see "Have a nice day." message