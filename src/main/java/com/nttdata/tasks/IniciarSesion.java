package com.nttdata.tasks;

import com.nttdata.pages.HomePage;
import com.nttdata.pages.LoginPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

@AllArgsConstructor
public class IniciarSesion implements Task {

    private final String username;
    private final String password;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_LOG_IN),                // abre el modal de login
                Enter.theValue(username).into(LoginPage.INP_USERNAME),
                Enter.theValue(password).into(LoginPage.INP_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN)                 // confirma el login
        );
    }

    public static Performable withData(String username, String password){
        return new IniciarSesion(username, password);
    }
}

