Feature: User logout

  @LogoutTest
  Scenario: A user attempts to logout
    Given the user is logged in
    When the user clicks on the logout button
    Then the user should be presented with the login page