Feature: Test login feature

Scenario: Verify that user is able to login with valid username and password
Given User is on TalentCentral Admin
When User enteres "automation.admin@shl.com" as username and "Shlonline@123" as password
And User clicks on submit button
Then User should be able to login successfully