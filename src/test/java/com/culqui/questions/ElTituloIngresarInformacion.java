package com.culqui.questions;

import com.culqui.userinterfaces.RegistroUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElTituloIngresarInformacion implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return RegistroUser.TITLE_INGRESAR_INFORMACION.resolveFor(actor).getText();
    }

    public static ElTituloIngresarInformacion validarPantallaRegistrarInformacion() {
        return new ElTituloIngresarInformacion();
}}
