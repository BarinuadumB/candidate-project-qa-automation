package com.ivanduri.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {

    public static final Target LOGIN_BUTTON =
            Target.the("Go to login - button").located(By.id("authentication-button-login"));

    public static final Target SCHEDULE_BUTTON =
            Target.the("Go to schedule - button").located(By.id("nav-schedule"));

    private MainPage() {
        super();
    }

}
