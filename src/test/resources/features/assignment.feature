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

  Scenario Outline: Calculate
    And Select simple form demo
    And Close popup
    And Input generate random two letters two numbers and current date into message field
    And Click show message
    Then Verify message display correct mapping with input data
    Then Enter number a "<firstNumber>" and Enter number b "<secondNumber>"
    And Click get total
    Then Verify <total> to select checkbox demo and select radio buttons demo
    Examples:
      | firstNumber | secondNumber | total  |
      | 3           | 5            | 8      |
      | -15         | 3            | -12    |
      | 10.054      | 2            | 12.054 |

  Scenario: Try While loop
    And Select Input form submit
    Then Enter email "aa"
    Then Verify email no longer error
    And Enter phone number "03"
    Then Enter "a" into Project Description
    Then Verify Project Description no longer error



