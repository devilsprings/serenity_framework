Feature: User Registration test

  Scenario Outline: User Registration
    Given user go to Bursa Marketplace page
    And user click on registration menu
    When user enter <Display name>, <Email> and <Password>
    And user click submit button without fill the CAPTCHA
    Then user will see error message "Captcha fields are mandatory"
    Examples:
      | Display name | Email                    | Password   |
      | "Bulbasaur"  | "Bulbasaur@testing.com"  | "123456a@" |
      | "Ivysaur"    | "Ivysaur@testing.com"    | "123456a@" |
      | "Venusaur"   | "Venusaur@testing.com"   | "123456a@" |
      | "Charmander" | "Charmander@testing.com" | "123456a@" |
      | "Charmeleon" | "Charmeleon@testing.com" | "123456a@" |
      | "Charizard"  | "Charizard@testing.com"  | "123456a@" |
      | "Squirtle"   | "Squirtle@testing.com"   | "123456a@" |
      | "Wartortle"  | "Wartortle@testing.com"  | "123456a@" |
