
@CEOName
Feature: Directory

Scenario Outline: Verification of the CEO name of OpenHRM website
Given User is on Home Page once logged in
When Navigate to menu>>directory
And select job title as "Chief Financial Officer" from the dropdown
And Do search
Then user should see CEO name as "<CFO Name>"
Examples:
|CFO Name|
|Peter Mac Anderson|


