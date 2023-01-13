Feature: Assignment

  @SP-2
  Scenario Outline: User answer survey question
    Given I open the survey Monkey page
    When I choose answer <Answer>
    And I submit my answer
    Then I should see "Have a nice day." message display
    Then I click Prev button
    And The <Clicked Button> button should be clicked
    And The <Not Clicked 1> button and <Not Clicked 2> button should not be clicked
    Examples:
      | Answer |Clicked Button|Not Clicked 1|Not Clicked 2|
      | "Bad"  |"Bad"         |"Good"       |"Okay"       |
      | "Good" |"Good"        |"Bad"        |"Okay"       |
      | "Okay" |"Okay"        |"Bad"        |"Good"       |
