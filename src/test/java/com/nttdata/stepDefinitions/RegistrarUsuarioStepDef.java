package com.nttdata.stepDefinitions;

import com.nttdata.tasks.NavegarA;
import com.nttdata.tasks.RegistrarUsuario;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegistrarUsuarioStepDef {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el {actor} esta en la pagina de inicio de Demoblaze")
    public void elActorEstaEnLaPaginaDeInicioDeDemoblaze(Actor actor) {
        actor.attemptsTo(NavegarA.theHomePage());
    }

    @And("selecciona el item de registrar usuario")
    public void seleccionaElItemDeRegistrarUsuario() {
        // Aquí deberías hacer el Click en el botón de Sign Up
        // pero lo dejamos listo para conectarlo con tu PageObject
        System.out.println("Se selecciona el item de registrar usuario");
    }

    @When("se registra ingresando usuario {string} y contraseña {string}")
    public void seRegistraIngresandoUsuarioYContrasenia(String usuario, String contrasenia) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistrarUsuario.withData(usuario, contrasenia)
        );
    }

    @Then("se muestra un mensaje de registro exitoso")
    public void seMuestraUnMensajeDeRegistroExitoso() {
        // Aquí puedes validar el alert que sale en Demoblaze
        System.out.println("Registro exitoso - validar mensaje de confirmación.");
    }
}


