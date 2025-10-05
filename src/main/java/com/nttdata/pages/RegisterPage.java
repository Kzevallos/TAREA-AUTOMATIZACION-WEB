package com.nttdata.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage extends PageObject {

    public static final Target INP_USERNAME = Target.the("Campo de texto para el usuario")
            .located(By.id("sign-username"));

    public static final Target INP_PASSWORD = Target.the("Campo de texto para la contraseña")
            .located(By.id("sign-password"));

    public static final Target BTN_SIGNUP = Target.the("Botón Sign up en el modal")
            .located(By.xpath("//button[text()='Sign up']"));
}

