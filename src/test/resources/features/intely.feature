Feature: Intely Tests

  Background:
    Given User is in the account creation page

  @wip
  Scenario: Account creation
    When user fills email box
    And user fills password box
    Then user clicks create button
    When user enters basic info page continue button is unclickable
    When user fills the first name continue button is yet unclickable
    When user fills the last name continue button is yet unclickable
    When user fills the mobile number continue button is yet unclickable
    When user fills the zip code continue button is yet unclickable
    When user selects qualification types the continue button is clickable
    When user fills shifts, work experiences and  agrees on terms
    Then user after clicking continue button will be redirected to OTP page
