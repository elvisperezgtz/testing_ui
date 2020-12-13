package com.qarmy.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterUI {
    public static final Target FIRST_NAME = Target.the("First name").locatedBy("//input[@name='firstname']");
    public static final Target LAST_NAME = Target.the("Last name").locatedBy("//input[@name='lastname']");
    public static final Target MOBILE_NUMBER = Target.the("Mobile number").locatedBy("//input[@name='phone']");
    public static final Target EMAIL = Target.the("Email").locatedBy("//input[@name='email']");
    public static final Target PASSWORD = Target.the("Password").locatedBy("//input[@name='password']");
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm Password").locatedBy("//input[@name='confirmpassword']");
    public static final Target SIGN_UP = Target.the("Sign up button").locatedBy("//button[@type='submit'][contains(.,'Sign Up')]");
    public static final Target BANNER = Target.the("Banner").locatedBy("//span[@id='cookieconsent:desc']");
    public static final Target GOT_IT = Target.the("Got it button").locatedBy("//button[contains(.,'Got it!')]");


}
