
package com.nttdata.tasks;

import com.nttdata.pages.HomePage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrAlCarrito {
    public static Task desdeHeader() {
        return Task.where("{0} accede al carrito desde el header",
                WaitUntil.the(HomePage.BTN_CART, isVisible()).forNoMoreThan(Duration.ofSeconds(5)),
                Click.on(HomePage.BTN_CART)

        );
    }
}


