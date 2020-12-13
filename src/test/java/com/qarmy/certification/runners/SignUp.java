package com.qarmy.certification.runners;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/sign_up.feature",
        glue = "com.qarmy.certification.stepdefinitions",snippets = CAMELCASE
)

public class SignUp {
}
