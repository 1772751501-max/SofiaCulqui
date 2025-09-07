package com.culqui.task.nuevoUsuario;

import com.culqui.userinterfaces.RegistroUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearUsuario implements Task {
    private final String nombre;
    private final String correo;

    public CrearUsuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public static Performable crearUsuarioNuevo(String nombre, String correo) {
        return instrumented(CrearUsuario.class, nombre, correo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(RegistroUser.INPUT_NOMBRE_REGISTE),
                Enter.theValue(correo).into(RegistroUser. INPUT_CORREO_SIGNUP),
                Click.on(RegistroUser.BUTTON_INCRIBIRSE)
        );
    }
}