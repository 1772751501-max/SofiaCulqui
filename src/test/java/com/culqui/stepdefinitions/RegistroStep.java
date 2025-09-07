package com.culqui.stepdefinitions;

import com.culqui.questions.ElTituloCuentaCreada;
import com.culqui.questions.ElTituloIngresarInformacion;
import com.culqui.questions.ElTituloRegistro;
import com.culqui.task.NavegateTo;
import com.culqui.task.loguearse.Inicio;
import com.culqui.task.nuevoUsuario.CrearUsuario;
import com.culqui.task.nuevoUsuario.InformacionNuevoUsuario;
import com.culqui.task.nuevoUsuario.IngresarInformacionDireccion;
import com.culqui.userinterfaces.RegistroUser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegistroStep {


    @When("el usuario ingresa su nombre {string} y correo {string}")
    public void el_usuario_ingresa_su_nombre_y_correo(String nombre, String correo) {
        theActorInTheSpotlight().should(
                seeThat("New User Signup!", ElTituloRegistro.validarPantallaRegistro(), equalTo(true))
        );
        theActorInTheSpotlight().attemptsTo(
                CrearUsuario.crearUsuarioNuevo(nombre, correo)
        );

    }

    @And("completa la información de la cuenta")
    public void completa_la_información_de_la_cuenta(io.cucumber.datatable.DataTable dataTable) {
        theActorInTheSpotlight().should(
                seeThat("Enter Account Information", ElTituloIngresarInformacion.validarPantallaRegistrarInformacion(), equalTo(true))
        );
        // Suponiendo que la tabla tiene una sola fila de datos (sin encabezado)
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String titulo = data.get(0).get("titulo");
        String password = data.get(0).get("contraseña");
        String dia = data.get(0).get("diaNacimiento");
        String mes = data.get(0).get("mesNacimiento");
        String año = data.get(0).get("añoNacimiento");

        OnStage.theActorInTheSpotlight().attemptsTo(
                InformacionNuevoUsuario.DatosNuevoUsuario(titulo, password, dia, mes, año)
        );
    }

    @And("acepta suscribirse al boletín")
    public void acepta_suscribirse_al_boletín() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(RegistroUser.CHECKBOX_SINGUP)

        );


    }

    @And("acepta recibir ofertas especiales")
    public void acepta_recibir_ofertas_especiales() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(RegistroUser.CHECKBOX_RECEIVE)
        );
    }


    @When("ingresa su información de dirección")
    public void ingresa_su_información_de_dirección(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String nombre = data.get(0).get("nombre");
        String apellido = data.get(0).get("apellido");
        String empresa = data.get(0).get("empresa");
        String direccion = data.get(0).get("direccion");
        String direccion2 = data.get(0).get("direccion2");
        String pais = data.get(0).get("pais");
        String estado = data.get(0).get("estado");
        String ciudad = data.get(0).get("ciudad");
        String codigoPostal = data.get(0).get("codigoPostal");
        String telefono = data.get(0).get("telefono");

        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarInformacionDireccion.Direccion(nombre, apellido, empresa, direccion,direccion2, pais, estado, ciudad, codigoPostal, telefono)
        );
    }

    @Then("el usuario ve un mensaje de registro exitoso")
    public void el_usuario_ve_un_mensaje_de_registro_exitoso() {
        theActorInTheSpotlight().should(
                seeThat("account-created", ElTituloCuentaCreada.cuentaCreadaExitosamente(), equalTo(true))
        );
    }

    @Given("el usuario navega a la página de login")
    public void elUsuarioNavegaALaPáginaDeLogin() {
    }

    @When("ingresa usuario incorrecto y contraseña válida")
    public void ingresaUsuarioIncorrectoYContraseñaVálida() {
        
    }

    @Then("debe ver el mensaje de error {string}")
    public void debeVerElMensajeDeError(String arg0) {
        
    }

    @When("ingresa usuario válido y contraseña incorrecta")
    public void ingresaUsuarioVálidoYContraseñaIncorrecta() {
    }
}
