package com.ivanduri.stepdefinitions.front.schedule;

import com.ivanduri.interactions.front.schedule.GoToSchedulePage;
import com.ivanduri.interactions.front.schedule.ScheduleCare;
import com.ivanduri.interactions.front.schedule.SelectIllness;
import com.ivanduri.questions.commons.TheUrl;
import com.ivanduri.questions.schedule.IllnessSelected;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

import static com.ivanduri.userinterface.SchedulePage.ILLNESS_DROPDOWN;
import static com.ivanduri.utils.enums.EnumVariablesSesion.ILLNESS_SELECTED;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.Matchers.containsString;

public class ScheduleStepDefinitions {
    private EnvironmentVariables environmentVariables;
    private static final String USER = "Ivan";
    private final String SCHEDULE_PATH = "/schedule";

    @Given("the user is on the schedule page")
    public void theUserIsOnTheSchedulePage() {
        theActorCalled(USER).wasAbleTo(
                Open.url(
                        EnvironmentSpecificConfiguration.from(environmentVariables)
                                .getProperty("webdriver.base.url")));
        theActorInTheSpotlight().attemptsTo(
                GoToSchedulePage.fromTheMainPage());
    }

    @And("he/she/it goes to the schedule page")
    public void heGoesToTheSchedulePage() {
        theActorInTheSpotlight().attemptsTo(
                GoToSchedulePage.fromTheMainPage());
    }

    @Then("he/she/it should see the schedule page correctly")
    public void heShouldSeeTheSchedulePage() {
        theActorInTheSpotlight().should(
                seeThat(TheUrl.obtained(), containsString(SCHEDULE_PATH)),
                seeThat(the(ILLNESS_DROPDOWN), isVisible()));
    }

    @When("he/she/it selects the {string} illness/injury")
    public void heSelectsTheIllnessInjury(String illnessName) {
        theActorInTheSpotlight().attemptsTo(
                SelectIllness.named(illnessName));
    }

    @Then("he should see that the illness/injury was selected correctly")
    public void heShouldSeeThatTheIllnessInjuryWasSelectedCorrectly() {
        String illnessSelected = theActorInTheSpotlight().recall(ILLNESS_SELECTED.getVariableSesion());
        theActorInTheSpotlight().should(
                seeThat(IllnessSelected.inTheDropdown(), containsString(illnessSelected)));
    }

    @When("he selects the ChatCare option")
    public void heSelectsTheChatCareOption() {
        theActorInTheSpotlight().attemptsTo(
                ScheduleCare.byChatCareOption());
    }
}
