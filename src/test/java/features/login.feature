Feature: Login Test
  @Regression
  Scenario: Login with valid email and password
    Given I am at Talentek webPage
    And I enter valid email
    And I enter valid password
    When I click on the login button
    Then I should be able to successfully login

  @Sanity
  Scenario: Login with invalid email and password
    Given I am at Talentek webPage
    And I enter email and password
    When I click on the login button
    Then I should be able to successfully not login

  @Regression
  Scenario: Login with invalid email and password
    Given I am at Talentek webPage
    And I enter invalid email
    And I enter invalid password
    When I click on the login button
    Then I should be able to successfully not login

    