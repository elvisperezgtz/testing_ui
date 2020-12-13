package com.qarmy.certification.interactions;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;

public class Highlight implements Interaction {
    Target target;

    public Highlight(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

       JavascriptExecutor js= (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
       js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid red;');",target.resolveFor(actor));
       Serenity.takeScreenshot();
       js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');",target.resolveFor(actor));

    }
    public static Highlight theTarget(Target target){
        return Tasks.instrumented(Highlight.class, target);
    }
}
