package com.culqui.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.util.logging.Logger;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"json:target/build/cucumber.json","html:target/cucumber/fast-report/cucumber-pretty.html"},
        features = {"src/test/resources/features"},
        glue = {"com.culqui.stepdefinitions", "com.culqui.hooks"},
        tags = " @login_fallido_usuario_incorrecto"


)

public class CucumberTestSuite {



}

