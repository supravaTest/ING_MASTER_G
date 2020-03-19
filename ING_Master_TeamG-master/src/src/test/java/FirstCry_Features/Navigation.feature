Feature: Navigations to Browser
@Home
Scenario: Navigations to browser and check the respective links
 Given launch the firstcry URL
 Then Validate the browser launched successfully
 When Navigate to "All Categories" link
 Then All the categories should be visible
 When User should select the preferred category "GIRL FASHION"
 