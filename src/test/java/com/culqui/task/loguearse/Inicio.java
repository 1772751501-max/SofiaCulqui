package com.culqui.task.loguearse;

import com.culqui.userinterfaces.LoginUser;
import com.culqui.userinterfaces.RegistroUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Inicio implements Task {
    public static Performable empezarLogueoRegistro() {
        return instrumented(Loguearse.class );

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginUser.BUTTON_LOGIN_REGISTER,isVisible()).forNoMoreThan(8).seconds(),
                Click.on(LoginUser.BUTTON_LOGIN_REGISTER)
        );
    }
}
