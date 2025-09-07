package com.culqui.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUser {
    public static final Target TITLE_REGISTER = Target.the("Titulo para loguearse").locatedBy("//h2[contains(text(),'New User Signup!')]");
    public static final Target INPUT_NOMBRE_REGISTE= Target.the("campo nombre para registrar nuevo usuario").located(By.name("name"));
    public static final Target INPUT_CORREO_SIGNUP = Target.the("campo correo signup").located(By.cssSelector("input[data-qa='signup-email']"));
    public static final Target BUTTON_INCRIBIRSE = Target.the("hace clic en el boton de registrarse").locatedBy("//button[@data-qa='signup-button']");
    public static final Target TITLE_INGRESAR_INFORMACION = Target.the("Titulo apra loguearse").locatedBy("//h2//b[contains(text(),'Enter Account Information')]");
    public static final Target CHECKBOX_MR = Target.the("campo nombre para registrar nuevo usuario").located(By.id("id_gender1"));
    public static final Target CHECKBOX_MRS = Target.the("checkbox MRS").located(By.id("id_gender2"));
    public static final Target INPUT_PASSWORD_REGISTED = Target.the("campo registrar contraseña").located(By.cssSelector("input[data-qa='password']"));
    public static final Target SELECT_DAY = Target.the("selector de día de nacimiento").located(By.cssSelector("select[data-qa='days']"));
    public static final Target SELECT_DAY_OPTION = Target.the("opción de día de nacimiento").locatedBy("//select[@data-qa='days']/option[@value='{0}']");
    public static final Target SELECT_MONTH = Target.the("selector de día de nacimiento").located(By.cssSelector("select[data-qa='months']"));
    public static final Target SELECT_MONTH_OPTION = Target.the("opción de día de nacimiento").locatedBy("//select[@data-qa='months']/option[@value='{0}']");
    public static final Target SELECT_YEAR = Target.the("selector de día de nacimiento").located(By.cssSelector("select[data-qa='years']"));
    public static final Target SELECT_YEAR_OPTION = Target.the("opción de día de nacimiento").locatedBy("//select[@data-qa='years']/option[@value='{0}']");
    public static final Target CHECKBOX_SINGUP = Target.the("campo nombre para registrar nuevo usuario").located(By.id("newsletter"));
    public static final Target CHECKBOX_RECEIVE = Target.the("campo nombre para registrar nuevo usuario").located(By.id("optin"));
    public static final Target TITLE_DIRECCION = Target.the("Titulo para dirección").locatedBy("//h2//b[contains(text(),'Address Information')]");
    public static final Target INPUT_FIRSTNAME = Target.the("campo nombre").located(By.cssSelector("input[data-qa='first_name']"));
    public static final Target INPUT_LASTNAME = Target.the("campo apellido").located(By.cssSelector("input[data-qa='last_name']"));
    public static final Target INPUT_COMPANY = Target.the("campo compañía").located(By.cssSelector("input[data-qa='company']"));
    public static final Target INPUT_ADDRESS = Target.the("campo dirección").located(By.cssSelector("input[data-qa='address']"));
    public static final Target INPUT_ADDRESS2 = Target.the("campo dirección 2").located(By.cssSelector("input[data-qa='address2']"));
    public static final Target SELECT_COUNTRY = Target.the("selector de país").located(By.cssSelector("select[data-qa='country']"));
    public static final Target SELECT_COUNTRY_OPTION = Target.the("opción de país").locatedBy("//select[@data-qa='country']/option[@value='{0}']");
    public static final Target INPUT_STATE = Target.the("campo estado").located(By.cssSelector("input[data-qa='state']"));
    public static final Target INPUT_CITY = Target.the("campo ciudad").located(By.cssSelector("input[data-qa='city']"));
    public static final Target INPUT_ZIPCODE = Target.the("campo código postal").located(By.cssSelector("input[data-qa='zipcode']"));
    public static final Target INPUT_MOBILENUMBER = Target.the("campo número de móvil").located(By.cssSelector("input[data-qa='mobile_number']"));
    public static final Target BUTTON_CREATE_ACCOUNT = Target.the("botón crear cuenta").located(By.cssSelector("button[data-qa='create-account']"));
    public static final Target TITLE_ACCOUNT_CREATED = Target.the("título cuenta creada").located(By.cssSelector("h2[data-qa='account-created']"));
    public static final Target BUTTON_CONTINUE = Target.the("botón continuar").located(By.cssSelector("a[data-qa='continue-button']"));
    public static final Target BUTTON_LOGOUT = Target.the("botón logout").located(By.xpath("//a[contains(.,'Logout')]"));

}
