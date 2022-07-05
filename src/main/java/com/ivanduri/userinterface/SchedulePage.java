package com.ivanduri.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SchedulePage {

    public static final Target ILLNESS_DROPDOWN =
            Target.the("Illness/Injury - dropdown").located(By.xpath("//div[@data-testid='CareSelector.trigger']/div"));

    public static final String ILLNESS_OPTION =
            "//div[@data-testid='CareSelector.list.option.%s']";

    public static final Target CHAT_CARE_BUTTON =
            Target.the("ChatCare - button").located(By.xpath("//button[@data-testId='virtualChatBox']"));

    private SchedulePage() {
        super();
    }
}
