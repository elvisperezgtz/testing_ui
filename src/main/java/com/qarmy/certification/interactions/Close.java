package com.qarmy.certification.interactions;

import com.qarmy.certification.userinterfaces.RegisterUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Close implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(RegisterUI.BANNER.resolveFor(theActorInTheSpotlight()).isPresent()) {
            actor.attemptsTo(Click.on(RegisterUI.GOT_IT));
        }
    }

    public static Close theBanner(){
        return Tasks.instrumented(Close.class);
    }
}
