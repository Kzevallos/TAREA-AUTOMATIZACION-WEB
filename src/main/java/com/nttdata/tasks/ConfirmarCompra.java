package com.nttdata.tasks;

import com.nttdata.pages.CartPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmarCompra {
    public static Performable ahora() {
        return Task.where("{0} confirma la compra",
                Click.on(CartPage.BTN_PURCHASE)
        );
    }
}
