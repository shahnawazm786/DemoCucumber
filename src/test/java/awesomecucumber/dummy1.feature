Feature: Add to Cart
  Rule: Add from Store
    Scenario Outline: Add one quantity to the cart
      Given I'm on the store page
      When I add a "<product_name>" to the cart
      Then I see 1 "<product_name>" in the cart

      Examples:
      |product_name|
      |Blue Shoes  |