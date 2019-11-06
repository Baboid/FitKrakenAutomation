Feature: Delete membership for a new member

  @DeleteTest
  Scenario: A user attempts to delete a memebership
    Given the user is logged in
    When the user clicks on the create new member icon
    And the user provides the name surname and email
    And the user provides the membership details
    Then the user should be presented with the member card
    When the user clicks on the delete membership option
    And the user confirms the delete
    Then the user should have zero memberships