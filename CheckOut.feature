@CheckOut_Page_PayPal_login
  Feature: Paypal
    @TC_CHECKOUT_7.11
    Scenario: paypal functionality
      Given user go to website
      When user click on shop link
      Then User will scroll down
      And user navigate to the selenium ruby book
      When user click add to basket
      And click on cart
      And click on proceed to checkout button
      Then user see the billing details form
      When user enter Firstname Lastname Company name Email
      And user select required country
      And user enter address
      And user select city state
      And user enter zip code
      And user select paypal
      And user click place order button
      Then user direct to the paypal page
