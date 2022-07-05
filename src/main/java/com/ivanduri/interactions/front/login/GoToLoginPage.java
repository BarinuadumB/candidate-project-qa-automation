package com.ivanduri.interactions.front.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import static com.ivanduri.userinterface.LoginPage.HAVE_ACCOUNT_BUTTON;
import static com.ivanduri.userinterface.MainPage.LOGIN_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToLoginPage implements Interaction {

    public static GoToLoginPage fromTheMainPage(){
        return instrumented(GoToLoginPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(
                        LOGIN_BUTTON.resolveFor(actor).waitUntilPresent()
                        .waitUntilClickable()
                        .isCurrentlyVisible())
                        .andIfSo(Click.on(LOGIN_BUTTON)));
        actor.attemptsTo(
                Check.whether(HAVE_ACCOUNT_BUTTON.resolveFor(actor).waitUntilPresent().isCurrentlyVisible())
                        .andIfSo(Click.on(HAVE_ACCOUNT_BUTTON)));
    }
}
