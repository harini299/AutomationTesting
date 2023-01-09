@Product_page
  Feature: Product
    @TC_PRODUCT_8.5
    Scenario: Add to basket functionality on the product page
      Given user go to website
      When user click shop menu
      Then navigate to Mastering Javascript book
      When click on add basket
      And click on cart link


    @Category_tags_links
     @TC_PRODUCT_8.7
      Scenario: Category and tag functionality
      Given user go to website
      When user click on shop nav menu
      And user click on html product
      And user click on the category HTML link
      Then user see the html products
      When user click tag html link
      Then user see the html products


    @Review_Ratings
     @TC_PRODUCT_8.10
      Scenario: verify your ratings functionality
      Given user go to website
      When user click on shop link nav menu
      And user click on html book
      And user click review tab
      And user click on one star rating
      And user enter review
      And user enter name email id
      And user click on submit button
      When user click on two star rating
      And user give some feedbacks
      And user enter name email
      And user click submit button
      When user click on three star rating
      And user give some inputs
      And user enter name email in the field
      And user click submit button third time
      When user click four star rating
      And user provide some reviews
      And enter name and email
      And click submit button
      When user click on five star rating
      And user provide inputs
      And enter user name and email
      And click on submit button
      Then user get the prompts Your comment is awaiting approval

