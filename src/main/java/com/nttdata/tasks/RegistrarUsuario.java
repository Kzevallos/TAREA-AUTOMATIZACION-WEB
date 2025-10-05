package com.nttdata.tasks;

import com.nttdata.pages.HomePage;
import com.nttdata.pages.RegisterPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

@AllArgsConstructor
public class RegistrarUsuario implements Task {

    private final String username;
    private final String password;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_SIGN_UP),               // abre el modal de registro
                Enter.theValue(username).into(RegisterPage.INP_USERNAME),
                Enter.theValue(password).into(RegisterPage.INP_PASSWORD),
                Click.on(RegisterPage.BTN_SIGNUP)             // confirma el registro
        );
    }

    public static Performable withData(String username, String password){
        return new RegistrarUsuario(username, password);
    }
}

