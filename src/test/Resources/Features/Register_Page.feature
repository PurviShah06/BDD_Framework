Feature: Registration feature

  @Test
  Scenario: User should able to register successfully so that user can use all user functionality
  on my application.
    Given user is already on HomePage.
    When  user clicks on register button
    And user enters all required registration Details.
    And user clicks on register Complete button
    Then user should able to register successfully
