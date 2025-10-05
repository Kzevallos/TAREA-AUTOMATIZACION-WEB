package com.nttdata.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target BTN_ADD_TO_CART = Target.the("Botón Add to cart")
            .located(By.xpath("//a[contains(@onclick,'addToCart')]"));
}

