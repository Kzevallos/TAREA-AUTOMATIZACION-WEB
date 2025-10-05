package com.nttdata.stepDefinitions;

import com.nttdata.pages.HomePage;
import com.nttdata.questions.AlertQuestion;
import com.nttdata.questions.VerificarCarritoVacio;
import com.nttdata.tasks.*;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class CompraProductoStepDef {

    @Given("el {actor} inicia sesión con usuario {string} y contraseña {string}")
    public void elActorIniciaSesion(Actor actor, String usuario, String contrasenia) {
        actor.attemptsTo(
                NavegarA.theHomePage(),
                IniciarSesion.withData(usuario, contrasenia)
        );
    }

    @When("el {actor} elige el producto Samsung Galaxy S6")
    public void eligeProductoSamsung(Actor actor) {
        actor.attemptsTo(SeleccionarProducto.aleatorio(HomePage.PRODUCTO_SAMSUNG_S6));
    }


    @And("el {actor} lo añade al carrito de compras")
    public void loAñadeAlCarritoDeCompras(Actor actor) {
        actor.attemptsTo(AgregarAlCarrito.ahora());
    }

    @And("el {actor} confirma la adición del producto")
    public void confirmaLaAdicionDelProducto(Actor actor) {
        String mensaje = AlertQuestion.text().answeredBy(actor);
        System.out.println("Mensaje del alert: " + mensaje);

        if (!mensaje.contains("Product added")) {
            System.out.println("Advertencia: el mensaje no coincide exactamente");
        }

        //actor.attemptsTo(IrAlCarrito.desdeHeader());
    }

    @And("el {actor} accede al carrito de compras")
    public void accedeAlCarritoDeCompras(Actor actor) {
        actor.attemptsTo(IrAlCarrito.desdeHeader());
    }

    @And("el {actor} selecciona comprar")
    public void seleccionaComprar(Actor actor) {
        actor.attemptsTo(SeleccionarComprar.ahora());
    }

    @And("el {actor} llena el formulario de compra")
    public void llenaFormulario(Actor actor) {
        actor.attemptsTo(
                LlenarFormularioCompra.conDatos("Kevin", "Peru", "Trujillo", "1234567890123456", "10", "2025")
        );
    }

    @And("el {actor} ejecuta la compra")
    public void confirmaCompra(Actor actor) {
        actor.attemptsTo(ConfirmarCompra.ahora());
    }

    @And("el {actor} confirma la compra exitosa")
    public void seConfirmaLaCompraConMensajeExitoso(Actor actor) {
        actor.attemptsTo(ConfirmarCompraExitosa.ahora());
    }

    @Then("el {actor} verifica que no haya ningún producto")
    public void verificaQueNoHayaNingunProducto(Actor actor) {
        actor.should(seeThat(VerificarCarritoVacio.estaVacio(), is(true)));
    }

}





