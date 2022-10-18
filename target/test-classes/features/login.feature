Feature: Is it Login?
  user should be able to log into the system

  Background:
    And click login link on the header

  Scenario: Login with valid account
#    Then login modal should popup
    And enter valid username and password
    And click login button
    Then verify that the user is logged in successfully

  Scenario: Login with invalid account
#    Then login modal should popup
    And enter invalid account
    And click login button
    Then verify that the user is not able to logged in

  Scenario: Login with valid username and invalid password
#    Then login modal should popup
    And enter valid username and invalid password
    And click login button
    Then verify that the user is not able to logged in

  Scenario: Login with invalid username and valid password
#    Then login modal should popup
    And enter invalid username and valid password
    And click login button
    Then verify that the user is not able to logged in
