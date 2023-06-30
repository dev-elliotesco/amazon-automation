package com.amazon.stepdefinitions;

import com.amazon.tasks.BuscarItem;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.ResultadosBusqueda.ITEM_FILTRO_MARCA;

public class FiltrarMarcaStepDefinitions {

    @Cuando("busco {string} y filtro por la marca samsung")
    public void buscatFiltroMarca(String item) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                BuscarItem.conFiltroMarca(item)
        );
    }
    @Entonces("el primer producto de la busqueda deberia ser de marca samsung")
    public void validarFiltroMarca() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(ITEM_FILTRO_MARCA).text().contains("SAMSUNG")
        );
    }

}
