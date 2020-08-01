Feature: Category Scenario
@Test
  Scenario Outline: user should able to navigate to correct category page so that she can use all product featurs from categories

    Given user is already on HomePage
    When user click on "<category>" link from homePage.
    Then user should able to navigate to "<relevant category page>" successfully.

    Examples:
      | category          | relevant category page                         |
      | Computers         | https://demo.nopcommerce.com/computers         |
#      | Electronics       | https://demo.nopcommerce.com/Electronics       |
#      | Apparel           | https://demo.nopcommerce.com/apparel           |
#      | Digital downloads | https://demo.nopcommerce.com/digital-downloads |
#      | Books             | https://demo.nopcommerce.com/books             |
#      | Jewelry           | https://demo.nopcommerce.com/jewelry           |
#      | Gift Cards        | https://demo.nopcommerce.com/gift-cards        |