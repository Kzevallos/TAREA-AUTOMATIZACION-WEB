package com.nttdata.stepDefinitions;

import com.nttdata.tasks.IniciarSesion;
import com.nttdata.tasks.NavegarA;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class IniciarSesionStepDef {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el {actor} abre la pagina de Demoblaze para login")
    public void elActorAbreLaPaginaDeDemoblazeParaLogin(Actor actor) {
        actor.attemptsTo(NavegarA.theHomePage());
    }

    @When("inicia sesion con usuario {string} y contrasenia {string}")
    public void iniciaSesionConUsuarioYContrasenia(String usuario, String contrasenia) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IniciarSesion.withData(usuario, contrasenia)
        );
    }

    @Then("el inicio de sesion es exitoso")
    public void elInicioDeSesionEsExitoso() {
        // Aquí podemos validar que aparezca el nombre del usuario logueado
        System.out.println("Inicio de sesión exitoso - validar en pantalla principal.");
    }
}
