package com.culqui.questions;

import com.culqui.userinterfaces.LoginUser;
import com.culqui.userinterfaces.RegistroUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ElTituloRegistro implements Question {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(RegistroUser.TITLE_REGISTER,isVisible()).forNoMoreThan(20).seconds()
        );
        return RegistroUser.TITLE_REGISTER.resolveFor(actor).getText();
    }

    public static ElTituloRegistro validarPantallaRegistro() {

        return new ElTituloRegistro();
    }
}
