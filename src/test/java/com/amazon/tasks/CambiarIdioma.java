package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.CabeceraPage.BTN_IDIOMA;
import static com.amazon.page.IdiomaPage.BTN_DE;
import static com.amazon.page.IdiomaPage.BTN_GUARDAR_IDIOMA;

public class CambiarIdioma {

    public static Performable deutsch() {
        return Task.where("cambiando idioma a Aleman",
                Click.on(BTN_IDIOMA),
                Click.on(BTN_DE),
                Click.on(BTN_GUARDAR_IDIOMA)
        );
    }

}
