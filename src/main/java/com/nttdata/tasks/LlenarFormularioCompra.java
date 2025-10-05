package com.nttdata.tasks;

import com.nttdata.pages.CartPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

@AllArgsConstructor
public class LlenarFormularioCompra implements Task {

    private final String nombre, pais, ciudad, tarjeta, mes, anio;

    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(CartPage.INP_NAME),
                Enter.theValue(pais).into(CartPage.INP_COUNTRY),
                Enter.theValue(ciudad).into(CartPage.INP_CITY),
                Enter.theValue(tarjeta).into(CartPage.INP_CREDIT_CARD),
                Enter.theValue(mes).into(CartPage.INP_MONTH),
                Enter.theValue(anio).into(CartPage.INP_YEAR)
        );
    }

    public static Performable conDatos(String nombre, String pais, String ciudad, String tarjeta, String mes, String anio) {
        return new LlenarFormularioCompra(nombre, pais, ciudad, tarjeta, mes, anio);
    }
}

