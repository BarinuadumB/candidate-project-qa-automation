package com.ivanduri.stepdefinitions.commons;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import lombok.Getter;
import lombok.Setter;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

@Getter
@Setter
public class CommonsStepDefinition {

  private EnvironmentVariables environmentVariables;
  private static final String USER = "Ivan";

  @Before
  public void setTheStage() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("the user is on the main page")
  public void userOnMainPage() {
    theActorCalled(USER).wasAbleTo(
            Open.url(
                    EnvironmentSpecificConfiguration.from(environmentVariables)
                            .getProperty("webdriver.base.url")));
  }

  @And("he is not logged in")
  public void heIsNotLoggedIn() {
    //empty step definition.
  }
}
