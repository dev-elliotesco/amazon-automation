package com.amazon.stepdefinitions;

import com.amazon.tasks.NuevaRegion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class CambiarRegionStepDefinitions {

    @Cuando("cambio la region a Canada")
    public void cambioRegion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NuevaRegion.canada()
        );
    }

    @Entonces("veo la pagina de la region de Canada en una nueva ventana")
    public void paginaRegionNueva() {
    }
}
