Feature: category
  @Category
  Scenario Outline: user click on all categories successfully
    Given user is on homepage
    When user click on "<category>" link
    Then user should be able to navigate"<related categorypage>" successfully

    Examples:
    | category | related category page |
    | About Us | "/pages/about-us"     |
    | Shop     | "/collections/all"    |
    | Shipping | "/pages/shipping"     |
    | Return   | "/pages/returns"      |
    | Contact us | "/pages/contact-us" |


