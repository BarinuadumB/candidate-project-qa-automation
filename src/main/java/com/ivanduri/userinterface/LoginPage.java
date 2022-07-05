package com.ivanduri.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target HAVE_ACCOUNT_BUTTON =
            Target.the("Have an account - button").located(By.id("log_in_button-loginModal.register.logIn"));

    public static final Target USERNAME_INPUT =
            Target.the("Username input field").located(By.id("okta-signin-username"));

    public static final Target PASSWORD_INPUT =
            Target.the("Password input field").located(By.id("okta-signin-password"));

    public static final Target SIGN_IN_BUTTON =
            Target.the("Sign in - button").located(By.id("okta-signin-submit"));

    public static final Target USERNAME_INPUT_ALERT =
            Target.the("Username input alert").located(By.id("input-container-error9"));

    public static final Target PASSWORD_INPUT_ALERT =
            Target.the("Password input alert").located(By.id("input-container-error10"));

    public static final Target ERROR_CONTAINER_FORM =
            Target.the("Error container login form").located(By.className("okta-form-infobox-error"));

    private LoginPage() {
        super();
    }
}
