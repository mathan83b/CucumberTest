
@tag
Feature: Timesheet
  I want to use this template for my feature file

 
  @tag2
  Scenario Outline: Verification of Timesheet entry to CEO for OPENHRM website
    Given user is on the Login page
    When login by using correct credentials 
    And Go to Time through Menu
    And Click on Time
    And search CEO name 
    Then "<message>" should be displayed

    Examples: 
      |message|
      |No Pending timesheet|
      
