package com.ivanduri.questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.ivanduri.userinterface.LoginPage.*;

public class LoginError implements Question<String> {

    public static LoginError isVisible(){
        return new LoginError();
    }

    @Override
    public String answeredBy(Actor actor) {
        return ERROR_CONTAINER_FORM.resolveFor(actor).waitUntilPresent().getText();
    }
}
