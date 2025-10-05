package com.nttdata.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificarCarritoVacio implements Question<Boolean> {

    public static VerificarCarritoVacio estaVacio() {
        return new VerificarCarritoVacio();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        return driver.findElements(By.cssSelector("#tbodyid > tr")).isEmpty();
    }
}



