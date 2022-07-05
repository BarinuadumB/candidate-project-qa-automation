package com.ivanduri.tasks.front.login;

import lombok.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.ivanduri.userinterface.LoginPage.*;
import static org.apache.xml.utils.LocaleUtility.EMPTY_STRING;

@Data
public class Signin implements Task {

    private String username;
    private String password;

    public Signin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Signin withTheUser(String username, String password){
        return new Signin(username, password);
    }

    public static Signin withEmptyCredentials(){
        return new Signin(EMPTY_STRING, EMPTY_STRING);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(USERNAME_INPUT),
                Enter.theValue(password).into(PASSWORD_INPUT),
                Click.on(SIGN_IN_BUTTON));
    }
}
