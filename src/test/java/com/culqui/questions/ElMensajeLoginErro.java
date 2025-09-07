package com.culqui.questions;

import com.culqui.userinterfaces.LoginUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElMensajeLoginErro implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return LoginUser.MESSAGE_LOGIN_ERROR.resolveFor(actor).getText();
    }

    public static ElMensajeLoginErro validaMensajeError() {
        return new ElMensajeLoginErro();
    }
}