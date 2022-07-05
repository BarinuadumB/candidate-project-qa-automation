package com.ivanduri.questions.commons;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class TheUrl implements Question<String> {

    public static TheUrl obtained(){
        return new TheUrl();
    }

    @Override
    public String answeredBy(Actor actor) {
        return getDriver().getCurrentUrl();
    }
}
