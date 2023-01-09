@Cart_page
 Feature: ApplyCoupon button
  @TC_CART_6.6(1)
  Scenario: ApplyCoupon functionality with invalid data
    Given goto the site url
    When user click on shop menu
    Then navigate to the html web app development book
    When user click on add to basket button
    And click on view basket
    Then navigate to the cart page
    When user enter symbol in the coupon field
    And click apply coupon one time
    And enter mixed inputs
    And user click apply coupon button second time
    And user enter lowercase numbers symbols
    And click apply coupon third time
    When user enter invalid input
    And click apply coupon button fourth time
    And user enter no input
    And click on apply coupon button fifth time
    Then user see the error prompts


