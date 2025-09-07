Feature: Registro de usuario no cliente
  Como usuario no registrado
  Quiero crear una cuenta
  Para poder realizar compras en la plataforma

  Background:
    Given el cliente  accede a la página de login

  @registro_exitoso
  Scenario Outline: Registro exitoso de un nuevo usuario
    When el usuario ingresa su nombre "<nombre>" y correo "<correo>"
    And completa la información de la cuenta
      | titulo   | contraseña | diaNacimiento | mesNacimiento | añoNacimiento |
      | <titulo> | <password> | <dia>         | <mes>         | <año>         |
    And acepta suscribirse al boletín
    And acepta recibir ofertas especiales
    And ingresa su información de dirección
      | nombrePila   | apellido   | compañia   | direccion   | direccion2   | pais   | estado   | ciudad   | codigoPostal   | numeroTelefono   |
      | <nombrePila> | <apellido> | <compania> | <direccion> | <direccion2> | <pais> | <estado> | <ciudad> | <codigoPostal> | <numeroTelefono> |
    Then el usuario ve un mensaje de registro exitoso

    Examples: Datos válidos de registro
      | nombre | correo               | titulo | password | dia | mes | año   | nombrePila | apellido | compania  | direccion | direccion2 | pais | estado | ciudad | codigoPostal | numeroTelefono |
      | Juan      | juan@mail.com | Sr.      | pass123  | 01  | 01  | 1990   | Juan       | Pérez    | MiEmpresa | Calle 1   | Piso 2     | Perú | Lima   | Lima   | 15000        | 999999999      |