Feature: Assignment

  Scenario Outline: User answer survey question
    Given I open the survey Monkey page
    When I choose answer <Answer>
    And I submit my answer
    Then I should see "Have a nice day." message display
    Then I click Prev button
    And The "Bad" button should be clicked
    And The "Good" button and "Okay" button should not be clicked
    Examples:
      | Answer |
      | "Bad"  |