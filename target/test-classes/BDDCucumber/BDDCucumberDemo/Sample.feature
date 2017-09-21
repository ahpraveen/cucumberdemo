Feature: Google Page

Scenario: Launch google Page
Given I am on Google Search Page
When I search for "Cheese!"
Then Page title should be "Cheese! - Google Search" 