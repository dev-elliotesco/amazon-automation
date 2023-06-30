package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadosBusqueda {
    public static Target ITEM_COMPRA_ENVIO_COLOMBIA = Target.the("item buscado con envio a Colombia").locatedByFirstMatching("//span[text()='Con envíos a Colombia']/ancestor::div[@data-csa-c-type='item']//img");
    public static Target ITEM_FILTRADOS_PRECIO =  Target.the("item con filtro de precio").locatedByFirstMatching("//span[@class=\"a-price-whole\"]");
    public static Target ITEM_FILTRO_MARCA =  Target.the("item con filtro de marca").locatedByFirstMatching("//span[@class='a-size-medium a-color-base a-text-normal']");
    public static Target LIRBRO_TITULO =  Target.the("item con filtro de marca").locatedByFirstMatching("//span[@class='a-size-medium a-color-base a-text-normal']");
}
