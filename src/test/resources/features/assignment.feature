Feature: Automation training

  Background:
    Given I access Anh tester website
    And I click on sidebar menu Input Forms

  Scenario: Verify result
    And Select simple form demo
    And Close popup
    And Input generate random two letters two numbers and current date into message field
    And Click show message
    Then Verify message display correct mapping with input data
    Then Enter number “a” in “enter a” field "11"
    And Enter number “b” in “enter b” field "22"
    And Click get total
    Then Verify total a+b is correct

