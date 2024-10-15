Feature: Testing various options in browser

  @browser
  Scenario: Validate various options in browser practise page
    Given I open the Browser
    When I open the link
    Then I tap on radio button
    Then I tap on the text box
    Then I click on dropdown and select option1
    Then I tap on second checkbox