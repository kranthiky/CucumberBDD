Feature: check Leaves of the User and Apply a leave

  Background: Launch and Login to Application
    Given user browsed URL and on login page
    When user entered username and password and click LOGIN button
    Then user is navigated to Dashboard page

  Scenario: check My Leaves
    Given user is on Dashboard page
    When user clicks My Leave link
    Then user is navigated to My Leave page

  Scenario: Apply a Leave
    Given user is on My Leave page
    When user clicks Apply link
    Then user is navigated to Apply Leave page
    
    #Scenario Outline:
      #   Examples:
 			 #     | URL                                       |username | password |
 			 #    | https://opensource-demo.orangehrmlive.com |Admin    | admin123 |
