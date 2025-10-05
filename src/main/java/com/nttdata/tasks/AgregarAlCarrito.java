package com.nttdata.tasks;

import com.nttdata.pages.ProductPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarAlCarrito {
    public static Performable ahora() {
        return Task.where("{0} agrega el producto al carrito",
                Click.on(ProductPage.BTN_ADD_TO_CART));
    }
}


