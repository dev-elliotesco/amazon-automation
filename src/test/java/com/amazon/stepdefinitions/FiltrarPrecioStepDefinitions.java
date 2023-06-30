package com.amazon.stepdefinitions;

import com.amazon.tasks.BuscarItem;
import com.amazon.tasks.ValidarPrecio;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class FiltrarPrecioStepDefinitions {

    @Dado("estoy en la pagina de Amazon")
    public void iniciarPagina() {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"));
    }
    @Cuando("busco {string} y filtro los precios de la busqueda entre  {int} y {int}")
    public void buscarFiltrarPrecio(String item, Integer valorMinimo, Integer valorMaximo) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                BuscarItem.conFiltroPrecio(item,valorMinimo,valorMaximo)
        );
    }

    @Entonces("el primer producto de la busqueda deberia tener un precio entre {int} y {int}")
    public void validarFiltroPrecio(Integer valorMinimo, Integer valorMaximo) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(ValidarPrecio.validarPrecio()).isGreaterThanOrEqualTo(valorMinimo),
                Ensure.that(ValidarPrecio.validarPrecio()).isLessThan(valorMaximo)
        );
    }
}