#language: en
Feature: Filling in Forms and Recive and Email.
Scenario: Fill all forms and it shows the email message in the end.
	Given Tricentis site is opened
	When user fill in Enter Vehicle Data Form
  And user fill in Enter Insurant Data Form
  And user fill in Enter Product Data Form
  And user select Price Option and Check
  And user fill information and Send Quote
  Then a sending e-mail success message is shown  