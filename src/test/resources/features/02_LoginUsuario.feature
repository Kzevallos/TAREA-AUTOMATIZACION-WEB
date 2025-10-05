@HU02-LoginUsuario
Feature: Iniciar sesión en la página web de Demoblaze

  @ESC02 @HappyPath @LoginUsuario
  Scenario Outline: Iniciar sesión con credenciales válidas de manera exitosa
    Given el actor abre la pagina de Demoblaze para login
    When inicia sesion con usuario "<usuario>" y contrasenia "<contrasenia>"
    Then el inicio de sesion es exitoso

    Examples:
      | usuario   | contrasenia |
      | kevinZN   | zevallos123 |
