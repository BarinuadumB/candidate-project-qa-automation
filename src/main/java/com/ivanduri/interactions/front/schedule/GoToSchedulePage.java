package com.ivanduri.interactions.front.schedule;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static com.ivanduri.userinterface.MainPage.SCHEDULE_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToSchedulePage implements Interaction {

    public static GoToSchedulePage fromTheMainPage() {
        return instrumented(GoToSchedulePage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(
                        SCHEDULE_BUTTON.resolveFor(actor).waitUntilPresent()
                                .waitUntilClickable()
                                .isCurrentlyVisible())
                        .andIfSo(Click.on(SCHEDULE_BUTTON)));
    }
}
