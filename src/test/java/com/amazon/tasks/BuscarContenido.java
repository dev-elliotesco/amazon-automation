package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.BarraNavegacionLateral.*;

public class BuscarContenido {

    public static Performable appStore() {
        return Task.where(" buscando la categoria app store",
                Click.on(BTN_BARRA_NAVEGACION),
                Click.on(BTN_APP_STORE),
                Click.on(BTN_TODAS_APPS)
        );
    }
}
