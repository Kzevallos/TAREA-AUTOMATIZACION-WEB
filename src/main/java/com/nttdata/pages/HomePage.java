package com.nttdata.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.demoblaze.com/")
public class HomePage extends PageObject {

    // SIGN UP
    public static final Target BTN_SIGN_UP = Target.the("Botón para abrir el modal de registro")
            .located(By.id("signin2"));

    // LOG IN
    public static final Target BTN_LOG_IN = Target.the("Botón para abrir el modal de inicio de sesión")
            .located(By.id("login2"));

    public static final Target PRODUCTO_SAMSUNG_S6 = Target.the("Producto Samsung Galaxy S6")
            .located(By.xpath("//a[text()='Samsung galaxy s6']"));

    public static final Target BTN_CART = Target.the("Botón para acceder al carrito")
            .located(By.id("cartur"));

}
