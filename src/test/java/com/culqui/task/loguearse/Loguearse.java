package com.culqui.task.loguearse;

import com.culqui.userinterfaces.LoginUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Loguearse implements Task {

    private final String email;
    private final String password;

    public Loguearse(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static Performable conCredenciales(String email, String password) {
        return instrumented(Loguearse.class, email, password);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(LoginUser.INPUT_CORREO),
                Enter.theValue(password).into(LoginUser.INPUT_PASSWORD)

        );
    }
}