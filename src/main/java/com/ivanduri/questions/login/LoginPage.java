package com.ivanduri.questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.ivanduri.userinterface.LoginPage.USERNAME_INPUT;

public class LoginPage implements Question<Boolean> {

    public static LoginPage visible(){
        return new LoginPage();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return USERNAME_INPUT.resolveFor(actor).waitUntilPresent().isCurrentlyVisible();
    }
}
