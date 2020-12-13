package com.qarmy.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class UserHomePageUI {
    public static final Target GREETING = Target.the(" Greeting {0}").locatedBy("//h3[contains(.,'{0}')]");
}
