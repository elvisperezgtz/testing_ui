package com.qarmy.certification.task;


import com.qarmy.certification.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Step;

import static com.qarmy.certification.userinterfaces.RegisterUI.SIGN_UP;

public class SignUp implements Task {

    private User user;
    public SignUp(User user) {
        this.user = user;
    }
    @Step("{0} signs up in PHP travels")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Fill.theForm(user),
                MoveMouse.to(SIGN_UP),
                Click.on(SIGN_UP)
        );

    }
    public static SignUp inPhpTravels(User user){
        return Tasks.instrumented(SignUp.class,user);
    }
}
