package com.nttdata.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarProducto {
    public static Performable aleatorio(Target producto) {
        return Task.where("{0} selecciona un producto",
                Click.on(producto));
    }
}


