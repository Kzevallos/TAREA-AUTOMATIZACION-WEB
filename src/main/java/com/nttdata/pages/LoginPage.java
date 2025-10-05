package com.nttdata.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {

    public static final Target INP_USERNAME = Target.the("Campo de texto para el usuario en login")
            .located(By.id("loginusername"));

    public static final Target INP_PASSWORD = Target.the("Campo de texto para la contraseña en login")
            .located(By.id("loginpassword"));

    public static final Target BTN_LOGIN = Target.the("Botón Login en el modal")
            .located(By.xpath("//button[text()='Log in']"));
}
