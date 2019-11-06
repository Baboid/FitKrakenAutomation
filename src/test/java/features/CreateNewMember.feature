Feature: Create a new member

  @CreateMemberTest
  Scenario: A user attempts to create a new member
    Given the user is logged in
    When the user clicks on the create new member icon
    And the user provides the name surname and email
    And the user provides the membership details
    Then the user should be presented with the member card