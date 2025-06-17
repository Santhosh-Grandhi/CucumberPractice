Feature: My Second Feature File

  Background:
    Given User launching web application
    When Using credentials "santhoshgrandhi9@gmail.com" and "123456789"
    Then Landing page is displayed
    And Application is interactable
    
  @MobileTest
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    When I complete action
    Then I validate the outcomes
    And check more outcomes
  
  @MobileTest 
  Scenario: Reusable case
    Given I want to write a step with precondition
    When I complete action
    Then I validate the outcomes
    And check more outcomes
