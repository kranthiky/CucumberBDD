#@SmokeTest
Feature: Launch and Login to Orange HRM Application
#	@SmokeTest
  Scenario Outline: Launch Application
    Given the browser is launched
    When the user browsed <URL>
    Then Orange HRM application launched

    Examples: 
      | URL                                       |
      | https://opensource-demo.orangehrmlive.com |
	#@SmokeTest
  Scenario Outline: Login to Application
    Given user is on login page
    When user enter <username> and <password> and click LOGIN button
    Then user navigated to Dashboard page

    Examples: 
      | username | password |
      | Admin    | admin123 |