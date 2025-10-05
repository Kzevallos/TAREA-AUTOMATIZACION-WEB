package com.nttdata.tasks;

import com.nttdata.pages.CartPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarComprar {
    public static Performable ahora() {
        return Task.where("{0} selecciona 'Place Order'",
                WaitUntil.the(CartPage.BTN_PLACE_ORDER, isVisible()).forNoMoreThan(Duration.ofSeconds(5)),
                Click.on(CartPage.BTN_PLACE_ORDER)

        );
    }
}



