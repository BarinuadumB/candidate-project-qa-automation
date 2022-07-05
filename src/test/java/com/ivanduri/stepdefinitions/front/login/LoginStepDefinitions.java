package com.ivanduri.stepdefinitions.front.login;
import com.ivanduri.questions.login.LoginPage;
import com.ivanduri.tasks.front.login.Signin;
import com.ivanduri.interactions.front.login.GoToLoginPage;
import com.ivanduri.questions.login.LoginError;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.lang.Boolean.TRUE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class LoginStepDefinitions {

    @And("he/she/it goes to the login page")
    public void heGoesToTheLoginPage() {
        theActorInTheSpotlight().attemptsTo(
                GoToLoginPage.fromTheMainPage());
    }

    @When("he/she/it tries to login with empty credentials")
    public void heTriesToLoginWithEmptyCredentials() {
        theActorInTheSpotlight().attemptsTo(
                Signin.withEmptyCredentials());
    }

    @Then("he/she/it should see the login error login alert: {string}")
    public void heShouldSeeTheLoginErrorAlert(String errorMessageExpected) {
        theActorInTheSpotlight().should(
                seeThat(LoginError.isVisible(), containsString(errorMessageExpected)));
    }

    @And("he/she/it signs in with the following credentials: {string}, {string}")
    public void heSignsInWithTheFollowingCredentials(String username, String password) {
        theActorInTheSpotlight().attemptsTo(
                Signin.withTheUser(username, password));
    }

    @Then("he should see the login page")
    public void heShouldSeeTheLoginPage() {
        theActorInTheSpotlight().should(
                seeThat(LoginPage.visible(), is(TRUE)));
    }
}
