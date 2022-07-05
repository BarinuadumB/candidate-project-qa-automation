package com.ivanduri.interactions.front.schedule;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static com.ivanduri.userinterface.SchedulePage.ILLNESS_DROPDOWN;
import static com.ivanduri.userinterface.SchedulePage.ILLNESS_OPTION;
import static com.ivanduri.utils.enums.EnumVariablesSesion.ILLNESS_SELECTED;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class SelectIllness implements Interaction {

    private String illnessName;

    public static SelectIllness named(String illnessName){
        return instrumented(SelectIllness.class, illnessName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(ILLNESS_DROPDOWN.resolveFor(actor).waitUntilPresent().isCurrentlyVisible())
                        .andIfSo(Click.on(ILLNESS_DROPDOWN)));
        actor.attemptsTo(Click.on(String.format(ILLNESS_OPTION, illnessName)));
        actor.remember(ILLNESS_SELECTED.getVariableSesion(), illnessName);
    }
}
