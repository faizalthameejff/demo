Feature: Validating Facebook Page
Background:
Given User is on FB page

#Scenario Outline: FB page credential validation
#When User enters "<username>" and "<password>"
#And User clicks on login page

#Examples:
#|username|password|
#|Hello|123456|

Scenario: FB page Title validation
When User print title

Scenario: FB page URL validation
When User print URL