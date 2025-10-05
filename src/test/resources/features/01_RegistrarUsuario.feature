@HU01-RegistrarUsuario
Feature: Registrar un usuario en la página web de Demoblaze

  @ESC01 @HappyPath @RegistrarUsuario
  Scenario Outline: Registrar un usuario con datos válidos de manera exitosa
    Given el actor esta en la pagina de inicio de Demoblaze
    And selecciona el item de registrar usuario
    When se registra ingresando usuario "<usuario>" y contraseña "<contrasenia>"
    Then se muestra un mensaje de registro exitoso

    Examples:
      | usuario   | contrasenia |
      | kevinZN   | zevallos123 |

