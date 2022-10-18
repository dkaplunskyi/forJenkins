
Feature: SignUp

  Background:
    And click signUp link in header

    Scenario: User able to create a new account
      Then enter new username
      Then enter password
      And click signUp button
      Then verify that the new account created successfully

    Scenario: SignUp with existing account
      Then enter new username
      Then enter password
      And click signUp button
      Then verify that the account already exist