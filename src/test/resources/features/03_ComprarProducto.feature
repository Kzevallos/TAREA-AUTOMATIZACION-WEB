@HU03-ComprarProducto
Feature: Flujo completo de compra en Demoblaze

  @ESC05 @FlujoCompletoCompra
  Scenario Outline: Comprar un producto exitosamente y verificar que el carrito quede vacío
    Given el actor inicia sesión con usuario "<usuario>" y contraseña "<contrasenia>"
    When el actor elige el producto Samsung Galaxy S6
    And el actor lo añade al carrito de compras
    And el actor confirma la adición del producto
    And el actor accede al carrito de compras
    And el actor selecciona comprar
    And el actor llena el formulario de compra
    And el actor ejecuta la compra
    And el actor confirma la compra exitosa
    And el actor accede al carrito de compras
    Then el actor verifica que no haya ningún producto

    Examples:
      | usuario   | contrasenia |
      | kevinZN   | zevallos123 |

