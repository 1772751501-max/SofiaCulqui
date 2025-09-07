package com.culqui.questions;

import com.culqui.userinterfaces.RegistroUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElTituloCuentaCreada  implements Question {   @Override
public String answeredBy(Actor actor) {
    return RegistroUser.TITLE_ACCOUNT_CREATED.resolveFor(actor).getText();
}

    public static ElTituloCuentaCreada cuentaCreadaExitosamente() {
        return new ElTituloCuentaCreada();
    }
}
