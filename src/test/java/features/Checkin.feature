Feature: User check in

  @CheckinTest
  Scenario: A user attempts to check in
    Given the user is logged in
    When the user clicks on the create new member icon
    And the user provides the name surname and email
    And the user provides the membership details
    Then the user should be presented with the member card
    When the user clicks on the check in button
    And the user confirms the check in
    Then the user should be presented with the check in list
    And the users total sessions should be decremented by one