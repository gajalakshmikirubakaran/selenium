Feature: Login

@execute
  Scenario: Login into the form
    Given I have a username and password
    When I provide username and password
    Then I could be able to login
