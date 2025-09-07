package com.culqui.task.nuevoUsuario;


import com.culqui.userinterfaces.RegistroUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class IngresarInformacionDireccion implements Task {

    private final String nombrePila;
    private final String apellido;
    private final String compania;
    private final String direccion;
    private final String direccion2;
    private final String pais;
    private final String estado;
    private final String ciudad;
    private final String codigoPostal;
    private final String numeroTelefono;

    public IngresarInformacionDireccion(String nombrePila, String apellido, String compania, String direccion, String direccion2,
                                        String pais, String estado, String ciudad, String codigoPostal, String numeroTelefono) {
        this.nombrePila = nombrePila;
        this.apellido = apellido;
        this.compania = compania;
        this.direccion = direccion;
        this.direccion2 = direccion2;
        this.pais = pais;
        this.estado = estado;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.numeroTelefono = numeroTelefono;
    }

    public static Performable Direccion(String nombrePila, String apellido, String compania, String direccion, String direccion2, String pais, String estado, String ciudad, String codigoPostal, String numeroTelefono) {
        return instrumented(IngresarInformacionDireccion.class, nombrePila, apellido, compania, direccion, direccion2, pais, estado, ciudad, codigoPostal, numeroTelefono);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RegistroUser.TITLE_DIRECCION, isVisible()).forNoMoreThan(8).seconds(),
                Enter.theValue(nombrePila).into(RegistroUser.INPUT_FIRSTNAME),
                Enter.theValue(apellido).into(RegistroUser.INPUT_LASTNAME),
                Enter.theValue(compania).into(RegistroUser.INPUT_COMPANY),
                Enter.theValue(direccion).into(RegistroUser.INPUT_ADDRESS),
                Enter.theValue(direccion2).into(RegistroUser.INPUT_ADDRESS2),
                Click.on(RegistroUser.SELECT_COUNTRY),
                Click.on(RegistroUser.SELECT_COUNTRY_OPTION.of(pais).called(pais)),
                Enter.theValue(estado).into(RegistroUser.INPUT_STATE),
                Enter.theValue(ciudad).into(RegistroUser.INPUT_CITY),
                Enter.theValue(codigoPostal).into(RegistroUser.INPUT_ZIPCODE),
                Enter.theValue(numeroTelefono).into(RegistroUser.INPUT_MOBILENUMBER),
                Click.on(RegistroUser.BUTTON_CREATE_ACCOUNT),
                WaitUntil.the(RegistroUser.TITLE_ACCOUNT_CREATED, isVisible()).forNoMoreThan(8).seconds()
                );
    }
}