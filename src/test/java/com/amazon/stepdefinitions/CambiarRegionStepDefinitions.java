package com.amazon.stepdefinitions;

import com.amazon.tasks.NuevaRegion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.CabeceraPage.*;

public class CambiarRegionStepDefinitions {

    @Cuando("cambio la region a Canada")
    public void cambioRegion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NuevaRegion.canada()
        );
    }

    @Entonces("veo la pagina de la region de Canada en una nueva ventana")
    public void paginaRegionNueva() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Switch.toNewWindow(),
                MoveMouse.to(BTN_IDIOMA_REGION),
                Ensure.that(REGION).text().contains("Amazon.ca")

        );
    }
}
