package com.qarmy.certification.task;

import com.qarmy.certification.interactions.Highlight;
import com.qarmy.certification.models.User;
import com.qarmy.certification.userinterfaces.RegisterUI;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import java.time.Duration;

import static java.time.Duration.ofSeconds;


public class Fill implements Task {
    private User user;
    public Fill(User user){
        this.user= user;
    }

    @Override
    @Step("{0} fills the form with his personal information")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(user.getFirstName()).into(RegisterUI.FIRST_NAME.waitingForNoMoreThan(ofSeconds(10))),
                Highlight.theTarget(RegisterUI.FIRST_NAME),
                Enter.theValue(user.getLastName()).into(RegisterUI.LAST_NAME),
                Enter.theValue(user.getMobileNumber()).into(RegisterUI.MOBILE_NUMBER),
                Enter.theValue(user.getEmail()).into(RegisterUI.EMAIL),
                Enter.theValue(user.getPassword()).into(RegisterUI.PASSWORD),
                Enter.theValue(user.getPassword()).into(RegisterUI.CONFIRM_PASSWORD)
        );
    }
    public static Fill theForm(User user){
        return Tasks.instrumented(Fill.class,user);
    }
}
