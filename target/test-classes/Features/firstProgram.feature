Feature: My Feature File

  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #When I complete action
    #Then I validate the outcomes
    #And check more outcomes
    #
  #Scenario: Reusable case
    #Given I want to write a step with precondition
    #When I complete action
    #Then I validate the outcomes
    #And check more outcomes
    
  Scenario: Parameterization
    Given User launching web application
    When Using credentials "santhoshgrandhi9@gmail.com" and "123456789"
    Then Login page is displayed
    And Application is interactable