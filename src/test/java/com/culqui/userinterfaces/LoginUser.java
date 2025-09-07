package com.culqui.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUser {
    public static final Target BUTTON_LOGIN_REGISTER = Target.the("Seleccionar boton de registrarse o loguearse").locatedBy("//a[@href='/login' and contains(.,' Signup / Login')]");
    public static final Target TITLE_LOGIN= Target.the("Titulo para loguearse").locatedBy("//h2[contains(.,'Login to your account')]");
    public static final Target INPUT_CORREO_LOGIN = Target.the("campo correo login").located(By.cssSelector("input[data-qa='login-email']"));
    public static final Target INPUT_PASSWORD= Target.the("campo de  contraseña").located(By.name("password"));
    public static final Target BUTTON_LOGUEARSE= Target.the("hace clic en el boton de loguearse").located(By.xpath("//button[@data-qa='login-button']"));
    public static final Target MESSAGE_LOGIN_ERROR = Target.the("mensaje de error en login").located(By.xpath("//p[contains(text(),'Your email or password is incorrect!')]"));

}
