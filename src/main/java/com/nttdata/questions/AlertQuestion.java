package com.nttdata.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertQuestion implements Question<String> {

    public static AlertQuestion text() {
        return new AlertQuestion();
    }

    @Override
    public String answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        try {
            // Espera hasta que el alert esté presente (máx 10 segundos)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            alert.accept(); // Cierra el alert
            return alertText;

        } catch (TimeoutException e) {
            return "No se encontró ningún alert dentro del tiempo esperado";
        } catch (Exception e) {
            return "Error al manejar el alert: " + e.getMessage();
        }
    }
}



