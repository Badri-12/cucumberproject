Feature: Snapdeal search feature validation

Scenario: Verify search feature
Given user should be on snapdeal home page
When user enters text in search box
|"phones"|
And clicks on search button
Then online shopping page should be displayed
