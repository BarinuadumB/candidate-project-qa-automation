package com.ivanduri.interactions.front.schedule;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static com.ivanduri.userinterface.SchedulePage.CHAT_CARE_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScheduleCare implements Interaction {

    public static ScheduleCare byChatCareOption(){
        return instrumented(ScheduleCare.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(CHAT_CARE_BUTTON.resolveFor(actor).waitUntilPresent().isCurrentlyVisible())
                        .andIfSo(Click.on(CHAT_CARE_BUTTON)));

        //TODO workflow blocked by problem with user creation.
        //TODO when the blocking is gone, this class should become a Task with the rest of the workflow to schedule a care
    }
}
