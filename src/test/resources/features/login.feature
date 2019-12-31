Feature: Login
  Only authorized users should be able to login to the application.




  @valid_credential
  Scenario: Login as authorized user
    Given user is on the login page
    When user logs in with valid credentials
    Then account summary page should be displayed

  @invalid_credential
  Scenario: Login as authorized user
    Given user is on the login page
    When User logs in with invalid credentials
    Then User should not be able to login
    Then Error message should be displayed







