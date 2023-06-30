package com.amazon.stepdefinitions;

import com.amazon.tasks.BuscarContenido;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.AppStorePage.RECOMENDED_APPS_GAMES;

public class AppStoreStepDefinitions {

    @Cuando("busco en el contenido de la pagina")
    public void buscarContenido() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                BuscarContenido.appStore()
        );

    }
    @Entonces("podria ver la la pagina de app store de amazon")
    public void verAppStore() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(RECOMENDED_APPS_GAMES).text().contains("Apps")
        );
    }
}
