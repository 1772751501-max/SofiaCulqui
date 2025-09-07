package com.culqui.questions;

import com.culqui.userinterfaces.RegistroUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ElTituloIngresarInformacion implements Question {
    public static Question<Boolean> validarPantallaRegistrarInformacion(){

        return new ElTituloIngresarInformacion();
    }

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(RegistroUser.TITLE_INGRESAR_INFORMACION,isVisible()).forNoMoreThan(8).seconds()
        );
        return Visibility.of(RegistroUser.TITLE_INGRESAR_INFORMACION).answeredBy(actor).booleanValue();
    }

}
