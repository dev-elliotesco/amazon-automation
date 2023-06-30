package com.amazon.stepdefinitions;

import com.amazon.tasks.BuscarItem;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.ResultadosBusqueda.LIRBRO_TITULO;

public class BuscarLibroTituloStepDefinitions {

    @Cuando("busco {string} y")
    public void buscarLibro(String titulo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                BuscarItem.conCategoriaLibro(titulo)
        );
    }

    @Entonces("el primer libro deberia contener el titulo {string}")
    public void validarTitulo(String titulo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(LIRBRO_TITULO).text().contains(titulo)
        );
    }
}
