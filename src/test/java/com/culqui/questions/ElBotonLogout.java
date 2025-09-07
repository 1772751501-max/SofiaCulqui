package com.culqui.questions;

import com.culqui.userinterfaces.RegistroUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElBotonLogout implements Question {

        @Override
        public String answeredBy(Actor actor) {
            return RegistroUser.BUTTON_LOGOUT.resolveFor(actor).getText();
        }

        public static com.culqui.questions.ElBotonLogout validarLogueo() {
            return new com.culqui.questions.ElBotonLogout();
        }
}
