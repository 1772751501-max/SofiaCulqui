

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
    And  presiona el botón de iniciar sesión
    Then  muestra el boton de logout

    Examples:
      | email            | password   |
      | juan@mail.com    | Pass1234   |
      | maria@mail.com   | Maria2024  |


    #UnHappy path Cliente
  @login_noexitoso
  Scenario: Login con usuario incorrecto
    Given el usuario navega a la página de login
    When ingresa usuario incorrecto y contraseña válida
    Then debe ver el mensaje de error "Your email or password is incorrect!"

  Scenario: Login con contraseña incorrecta
    Given el usuario navega a la página de login
    When ingresa usuario válido y contraseña incorrecta
    Then debe ver el mensaje de error "Your email or password is incorrect!"

