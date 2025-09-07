
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

        public class InformacionNuevoUsuario implements Task {

    private final String titulo;
    private final String password;
    private final String dia;
    private final String mes;
    private final String ano;

    public InformacionNuevoUsuario(String titulo, String password, String dia, String mes, String ano) {
        this.titulo = titulo;
        this.password = password;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public static Performable DatosNuevoUsuario(String titulo, String password, String dia, String mes, String ano) {
        return instrumented(InformacionNuevoUsuario.class, titulo, password, dia, mes, ano);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Selección de título
        if ("Mr.".equalsIgnoreCase(titulo)) {
            actor.attemptsTo(Click.on(RegistroUser.CHECKBOX_MR));
        } else if ("Mrs.".equalsIgnoreCase(titulo)) {
            actor.attemptsTo(Click.on(RegistroUser.CHECKBOX_MRS));
        }
        actor.attemptsTo(
                WaitUntil.the(RegistroUser.TITLE_INGRESAR_INFORMACION,isVisible()).forNoMoreThan(8).seconds(),
                Enter.theValue(password).into(RegistroUser.INPUT_PASSWORD_REGISTED),
                Click.on(RegistroUser.SELECT_DAY),
                Click.on(RegistroUser.SELECT_DAY_OPTION.of(dia).called(dia)),
                Click.on(RegistroUser.SELECT_MONTH),
                Click.on(RegistroUser.SELECT_MONTH_OPTION.of(mes).called(mes)),
                Click.on(RegistroUser.SELECT_YEAR),
                Click.on(RegistroUser.SELECT_YEAR_OPTION.of(ano).called(ano))

        );
    }
}