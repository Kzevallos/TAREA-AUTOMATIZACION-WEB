package com.nttdata.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target BTN_PLACE_ORDER = Target.the("Botón Place Order")
            .located(By.xpath("/html/body/div[6]/div/div[2]/button"));



    public static final Target INP_NAME = Target.the("Campo nombre en el formulario de compra")
            .located(By.id("name"));

    public static final Target INP_COUNTRY = Target.the("Campo país en el formulario de compra")
            .located(By.id("country"));

    public static final Target INP_CITY = Target.the("Campo ciudad en el formulario de compra")
            .located(By.id("city"));

    public static final Target INP_CREDIT_CARD = Target.the("Campo tarjeta en el formulario de compra")
            .located(By.id("card"));

    public static final Target INP_MONTH = Target.the("Campo mes en el formulario de compra")
            .located(By.id("month"));

    public static final Target INP_YEAR = Target.the("Campo año en el formulario de compra")
            .located(By.id("year"));

    public static final Target BTN_PURCHASE = Target.the("Botón para confirmar la compra")
            .located(By.xpath("//button[text()='Purchase']"));

    public static final Target BTN_CONFIRMACION_OK = Target.the("Botón OK de confirmación de compra")
            .located(By.xpath("//button[text()='OK']"));

}
