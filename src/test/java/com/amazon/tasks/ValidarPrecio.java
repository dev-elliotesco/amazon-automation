package com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.amazon.page.ResultadosBusqueda.ITEM_FILTRADOS_PRECIO;
import static java.lang.Integer.parseInt;

public class ValidarPrecio {

    public static Integer validarPrecio() {

        Actor actor = OnStage.theActorInTheSpotlight();
        Integer precioItemFiltrado = parseInt(BrowseTheWeb.as(actor).find(ITEM_FILTRADOS_PRECIO).getText());
        return precioItemFiltrado;
    }
}
