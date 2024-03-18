Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    And user select gender type
    And user enter first name  and last name
    And user enter date of birth
    And user enter email
    And check option is selected
    And user fills Password fields
    And user clicks on register button
    Then success message is displayed

  Scenario Outline : guest user couldn't register with invalid data successfully
    Given user go to register page
    And user select gender type
    And user enter first name  and last name
    And user enter date of birth
    And user enter invalid email
    And error message will be displayed
    And check option is selected
    And user fills Password fields
    And user clicks on register button
    Then unable to register
    Examples: