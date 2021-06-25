Feature: Create login Functionality for LeafTaps Application

Background: Having common codes
#Given Open the Chrome Browser
And Open LeafTaps Url as 'http://leaftaps.com/opentaps/'

@smoke @regression
Scenario Outline: TC001_Logi with Valid User
Given Enter username as <username>
And Enter password as <password>
When Click on Login Button
Then Home Page should be displayed
And Username should be displayed in the Home Page

Examples:
|username|password|
|'DemoSalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@functional
Scenario: TC002_Logi with In-valid User
Given Enter username as 'DemoSalesmanager'
And Enter password as 'crmsfa123'
When Click on Login Button
But Home Page should not be displayed
