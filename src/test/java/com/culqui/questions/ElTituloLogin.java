package com.culqui.questions;

import com.culqui.userinterfaces.LoginUser;
import com.culqui.userinterfaces.RegistroUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ElTituloLogin implements Question {
    public static Question<Boolean> es(){

        return new ElTituloLogin();
    }

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginUser.TITLE_LOGIN,isVisible()).forNoMoreThan(8).seconds()
        );
        return Visibility.of(LoginUser.TITLE_LOGIN).answeredBy(actor).booleanValue();
    }


}
