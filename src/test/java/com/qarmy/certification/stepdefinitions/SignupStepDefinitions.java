package com.qarmy.certification.stepdefinitions;

import com.qarmy.certification.interactions.Close;
import com.qarmy.certification.interactions.Highlight;
import com.qarmy.certification.models.User;
import com.qarmy.certification.task.SignUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.qarmy.certification.userinterfaces.UserHomePageUI.GREETING;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

public class SignupStepDefinitions {

    @Managed(driver = "chrome",clearCookies = BeforeEachTest)
    WebDriver driver ;
    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Rocco");
    }

    @Given("^He is on PHP Travels website$")
    public void heIsOnPHPTravelsWebsite() {
       theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
       theActorInTheSpotlight().attemptsTo(Open.url("https://www.phptravels.net/register"));
       theActorInTheSpotlight().attemptsTo(Close.theBanner());


    }

    @When("^He signs up on PHP travels website$")
    public void heSignsUpOnPHPTravelsWebsite(List<User> users) {
        theActorInTheSpotlight().attemptsTo(
             SignUp.inPhpTravels(users.get(0))
        );
    }

    @Then("^He should be able to see the text (.*)$")
    public void heShouldBeAbleToSeeTheTextGreeting(String greeting) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(GREETING.of(greeting)).text().isEqualTo(greeting),
                Highlight.theTarget(GREETING.of(greeting))
        );

    }
}
