Feature: Google Page

Scenario: Launch google Page
Given I am on Google Search Page
When enter search key
| searchkey |
| Cheese! |
Then Page title should be "Cheese! - Google Search"