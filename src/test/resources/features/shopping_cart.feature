@testing
Feature: Shopping cart
  user should be able place an order successfully

  Background:
    When select a product on home page

  Scenario: place an order
    Then click on Add to cart button
    Then click Cart link on the header
    Then click to Place Order button
    Then fill out the form
    Then click Purchase button
    And verify that the order placed successfully

  Scenario: add item to the cart
    Then click on Add to cart button
    Then click Cart link on the header
    And verify that the item added to cart

  Scenario: delete item from cart
    Then click on Add to cart button
    Then click Cart link on the header
    Then click delete button
    And verify that the item deleted from cart
