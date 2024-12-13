Feature: Login

Scenario Outline: Verify Successful Login
Given User is on the login page
When User enters "<username>" and "<password>"
Then User should be redirected to the homepage

Examples:
|username|password|
|standard_user|secret_sauce|