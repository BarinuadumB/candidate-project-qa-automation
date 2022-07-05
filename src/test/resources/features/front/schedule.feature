@Smoke
Feature: Schedule

  Scenario: Go to schedule page
    Given the user is on the main page
    And he is not logged in
    When he goes to the schedule page
    Then he should see the schedule page correctly

  Scenario: Select illness/injury - frontend
    Given the user is on the schedule page
    And he is not logged in
    When he selects the "Emergency Care" illness
    Then he should see that the illness was selected correctly

  Scenario: Schedule a ChatCare - user not logged in
    Given the user is on the schedule page
    And he is not logged in
    When he selects the ChatCare option
    Then he should see the login page

