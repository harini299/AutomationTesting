@MyAccount
  Feature: MyAccount functionality
    @TC_my_Account5.7(3)
    Scenario: verify myAcc functions
      Given user go to website
      When user click on my account menu
      #And handle dynamic ad pop up
      Then user see the register heading
      When user enter email address
      And user enter password
      And user click on register button
      And user click on the Addresses link
      When user click on the shipping address edit link
      Then user see the shipping address form heading
      When user enter firstname lastname company
      And user select country
      And user enter address city
      And user select state
      And user enter postcode
      And user click on save address button
      Then user see the Address changed successfully prompt page

    #@Login_page
     @TC_my_Account_5.10
      Scenario:verify the login functionality
        Given user go to website
        When user click myAcc link
        And dismiss ad pop up
        Then user see the login heading
        And user enter email
        And user enter passwd
        And user click login button
        Then user see the login home page

    #@Login_lost_password
     @TC_5
        Scenario: validate the lost password link functionality
          Given user go to website
          When click acc
          And user click on the lost password
          And close ad pop up
          #Then user navigate to the reset email page
          When user enter symbols
          And click reset button first time
          And user navigate back
          When user enter numbers
          And click reset button second time
          And click on navigate back arrow
          When user enter with no input
          And click reset button third time
          And navigate back
          When enter uppercase lowercase
          And click reset button fourth time







