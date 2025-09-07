package com.culqui.stepdefinitions;

import com.culqui.questions.ElBotonLogout;
import com.culqui.questions.ElTituloIngresarInformacion;
import com.culqui.questions.ElTituloLogin;
import com.culqui.questions.ElTituloRegistro;
import com.culqui.task.NavegateTo;
import com.culqui.task.loguearse.Inicio;
import com.culqui.task.loguearse.Loguearse;
import com.culqui.task.nuevoUsuario.InformacionNuevoUsuario;
import com.culqui.userinterfaces.LoginUser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class LoguinStep {
    @Given("el (.*)  accede a la página de login$")
    public void el_cliente_abre_la_pagina_de_login(String actor) {
        theActorCalled(actor).attemptsTo(
                NavegateTo.AutomationExercise()

        );
        theActorInTheSpotlight().should(
                seeThat("New User Signup!", ElTituloRegistro.validarPantallaRegistro(), equalTo(true))
        );
        theActorCalled(actor).attemptsTo(

                Inicio.empezarLogueoRegistro()
        );
    }
    @When("ingresa el correo {string} y la contraseña {string}")
    public void ingresa_el_correo_y_la_contraseña(String email, String password) {
        theActorInTheSpotlight().should(
                seeThat("Login to your accoun", ElTituloLogin.es(), equalTo(true))
        );

        OnStage.theActorInTheSpotlight().attemptsTo(
                Loguearse.conCredenciales(email, password)
        );

    }
    @And("presiona el botón de iniciar sesión")
    public void presiona_el_botón_de_iniciar_sesión() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(LoginUser.BUTTON_LOGUEARSE)
        );



    }
    @Then("muestra el boton de logout")
    public void muestra_el_boton_de_logout() {
        theActorInTheSpotlight().should(
                seeThat("Logout", ElBotonLogout.validarLogueo(), equalTo("Logout"))
        );    }
}

