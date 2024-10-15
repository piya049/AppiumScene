Feature: Protractor page validate

@automation
Scenario Outline: Protractor page validation with form data
Given User navigates to protractor page
When user fills the form from the given sheetName "<SheetName>" and rowNumber <RowNumber>
Then user tap on check box
Then user select Gender
Then User tap on radio button of Employment status
Then User select his birthdate
And user clicks on submit button  
Then it shows successfull message "× Success! The Form has been submitted successfully!."

Examples:
|	SheetName		| RowNumber |
|	protractor	|		0				|


