package com.ivanduri.questions.schedule;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.ivanduri.userinterface.SchedulePage.ILLNESS_DROPDOWN;

public class IllnessSelected implements Question<String> {

    public static IllnessSelected inTheDropdown(){
        return new IllnessSelected();
    }

    @Override
    public String answeredBy(Actor actor) {
        return ILLNESS_DROPDOWN.resolveFor(actor).getText().trim();
    }
}
