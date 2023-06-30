package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.BarraNavegacionLateral.BTN_BARRA_NAVEGACION;
import static com.amazon.page.BarraNavegacionLateral.BTN_BARRA_REGION;
import static com.amazon.page.RegionPage.*;

public class NuevaRegion {

    public static Performable canada() {
        return Task.where("cambiar region a canada",
                Click.on(BTN_BARRA_NAVEGACION),
                Click.on(BTN_BARRA_REGION),
                Click.on(SELECT_REGION),
                Click.on(REGION),
                Click.on(BTN_REGION_NUEVA)
        );
    }

    ;
}
