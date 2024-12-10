Feature: Validate Different Options

  @appium
  Scenario: Validate Expandables Lists
    Given I open the application
    When I tap on Views
    Then I tap on the Expandables List
    Then I tap on the Custom Adaptor
    And validate the names 
    
    
  
