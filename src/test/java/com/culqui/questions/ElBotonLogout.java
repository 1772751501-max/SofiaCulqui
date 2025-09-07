package com.culqui.questions;

import com.culqui.userinterfaces.LoginUser;
import com.culqui.userinterfaces.RegistroUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ElBotonLogout implements Question {
    public static Question<Boolean> validarLogueo(){
        return new ElBotonLogout();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(RegistroUser.BUTTON_LOGOUT, isVisible()).forNoMoreThan(8).seconds()
        );
        return Visibility.of(RegistroUser.BUTTON_LOGOUT).answeredBy(actor);
    }

}
