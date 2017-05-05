@LoginPage
Feature: Create user and login in to Quidco app

  @joinUs
  Scenario: Create a user account
    Given launch the app
    And I click on "Join Us"
    When As a user I am filling the registration form
    Then I check user is logged in the app

  @login
  Scenario: Login as a existing user
    Given launch the app
    And I click on "Sign In"
    When Log in as existing user
    Then I check user is logged in the app