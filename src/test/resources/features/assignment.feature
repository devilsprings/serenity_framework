Feature: Automation training

  Background:
    Given I access Anh tester website
    And I click on sidebar menu "Input Forms"

  Scenario: Verify result
    And I click on sidebar menu "Simple Form Demo"
    And Select simple form demo
    And Input generate random 2 letters 2 numbers and current date into message field
    And Click show message
    Then Verify message display correct mapping with input data
    Then Enter number “a” in “enter a” field
    And Enter number “b” in “enter b” field
    And Click get total
    Then Verify total a+b = <result> correct

