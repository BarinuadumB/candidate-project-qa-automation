@Smoke
Feature: Login

  Background: Go to login page
    Given the user is on the main page
    And he goes to the login page

  Scenario: Login with empty credentials
    When he tries to login with empty credentials
    Then he should see the login error login alert: "Hemos encontrado algunos errores. Revise el formulario y corríjalo."

  Scenario: Login with invalid credentials
    When he signs in with the following credentials: "ivanduri@gmail.com", "QAAutomation"
    Then he should see the login error login alert: "No se puede iniciar sesión"
