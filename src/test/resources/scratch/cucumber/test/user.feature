Feature: User

  Scenario: I create a new user
    Given I am on the create user page
    When I enter in the details for a new user
    And I submit the page
    Then I should be back on the create user page
    And the new user should be displayed