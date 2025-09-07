package com.culqui.questions;

import com.culqui.userinterfaces.LoginUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElTituloLogin implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return LoginUser.TITLE_LOGIN.resolveFor(actor).getText();
    }

    public static ElTituloLogin es() {
        return new ElTituloLogin();
    }
}
