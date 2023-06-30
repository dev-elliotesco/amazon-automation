package com.amazon.stepdefinitions;

import com.amazon.tasks.CambiarIdioma;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.CabeceraPage.SELECT_CATEGORIA;

public class CambiarIdiomaStepDefinitions {

    @Cuando("cambio el idioma")
    public void cambioIdioma() {

        CambiarIdioma.deutsch();
    }
    @Entonces("veo la pagina en en idioma seleccionado")
    public void paginaIdiomaSelecionada() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(SELECT_CATEGORIA).text().contains("Alle Kategorien")
        );
    }
}
