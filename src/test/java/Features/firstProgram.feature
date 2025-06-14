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
  
  @Smoketest
  Scenario: Parameterization
    Given User launching web application
    When Using credentials "santhoshgrandhi9@gmail.com" and "123456789"
    Then Landing page is displayed
    And Application is interactable
    
  @Smoketest @Regressiontest
  Scenario Outline:
    Given User launching web application
    When Using credentials <username> and "<password>"
    Then Landing page is displayed
    And Application is interactable
    
    Examples:
    | username | password |
    | santhosh |   12345  |
    | Test     |   56789  |
    | Test2    |   45678  |
    
 #Data Driven
 
 @MobileTesting
 Scenario: Data Driven concept
    Given User launching web application
    When Using following data
    |   user   |
    | santhosh |
    |   Test   |
    Then Landing page is displayed
    And Application is interactable

 
    