Feature: Send a message
  user should be able to send a message

  Background:
    When click contact link in the header
  @testing
  Scenario: fill out the form and send a message
    Then fill out form
    Then click Send message button
    And check alert message