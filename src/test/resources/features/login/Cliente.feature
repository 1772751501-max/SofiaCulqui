

Feature: Inicio de sesión de cliente
  Como cliente
  Quiero iniciar sesión en la plataforma
  Para poder realizar compras

  Background: abrir página de  compra
    Given el cliente  accede a la página de login

  #Happy path Cliente
  @login_exitoso
  Scenario Outline: Inicio de sesión exitoso con credenciales válidas
    When ingresa el correo "<email>" y la contraseña "<password>"
    And  presiona el boton de iniciar sesion
    Then  muestra el boton de logout

    Examples:
      | email            | password   |
      | juan@mail.com    | pass123   |


    #UnHappy path Cliente
  @login_fallido_usuario_incorrecto
  Scenario Outline: Login con usuario incorrecto
    When ingresa el correo "<email>" y la contraseña "<password>"
    And  presiona el boton de iniciar sesion
    Then debe ver el mensaje de error "Your email or password is incorrect!"
    Examples:
      | email         | password |
      | ri@mail.com | pass123 |


  @login_fallido_contrasena_incorrecto
  Scenario Outline: Login con usuario incorrecto
    When ingresa el correo "<email>" y la contraseña "<password>"
    And  presiona el boton de iniciar sesion
    Then debe ver el mensaje de error "Your email or password is incorrect!"
    Examples:
      | email         | password |
      | juan@mail.com | pass1234 |
