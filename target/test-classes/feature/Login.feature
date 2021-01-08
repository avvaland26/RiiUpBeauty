Feature: open browser successfully

  Scenario: user open browser successfully
    Given user opens browser
    When user enters URL
    Then user opens browser successfully

   @Test1
    Scenario: user open browser successfully
      Given   user is on homepage
      When    user click on contact us button
      Then user opens contact us page successfully

     @Test2
      Scenario: user open browser successfully
        Given user is on homepage
        When user click About Us button
        Then user opens About Us Page Successfully

       @Test3
        Scenario: user open shipping page successfully
          Given user is on homepage
          When user is click on shipping button
          Then user open shipping page successfully

         @Test4
          Scenario: user open return page successfully
            Given user is on homepage
            When user is click on return button
            Then user open return page successfully


     @Test5
     Scenario: user open shop page successfully
       Given user is on homepage
       When user is click on shop button
       Then user open shop page successfully
