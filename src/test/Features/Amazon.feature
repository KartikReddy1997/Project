Feature: Validating the functionality of Amazon
  Scenario : Amazon


  @D
  Scenario: User Login to Amazon application
    Given I am on Amazon application
    When User clicks on signin button
    And Enters "phone" and "ABCxyz@123"
    Then User Should Login Successfully

  @DESKTOP
  Scenario: User visits Amazon application
    Given I am on Amazon application
    When I move to cart
    Then User should see You cart is empty
    Then print "name"


  @D
    Scenario: Adding products to cart
      Given User should see You cart is empty
      When User search for a particular "iphone 15 pro"
      And User adds the "iphone 15 pro" to the cart
      Then I move to cart
      And Validate "iphone 15 pro" is added to the cart