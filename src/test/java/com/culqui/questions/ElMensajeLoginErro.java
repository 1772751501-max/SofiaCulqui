package com.culqui.questions;

import com.culqui.userinterfaces.LoginUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
public class ElMensajeLoginErro implements Question<String> {
    public static Question<String> validaMensajeError(){
        return new ElMensajeLoginErro();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginUser.MESSAGE_LOGIN_ERROR, isVisible()).forNoMoreThan(8).seconds()
        );
        return Text.of(LoginUser.MESSAGE_LOGIN_ERROR).answeredBy(actor);
    }
}