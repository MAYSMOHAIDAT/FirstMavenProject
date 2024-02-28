Feature: Search Functionality 

@ebay_outline
Scenario Outline:
Search for items


Given verify user in ebay search page
When search testdata "<testdata>"
Then get text for search criteria text element
And verify it matches the search input


Examples:
|testdata         |
|coffee mug       |
|pretty coffee mug|
|cool coffee mug  |
|cute coffee mug  |
