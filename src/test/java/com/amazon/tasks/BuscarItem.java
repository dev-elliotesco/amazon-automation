package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.amazon.page.CabeceraPage.*;
import static com.amazon.page.FiltrosItem.*;

public class BuscarItem {

    public static Performable conEnvioColombia(String item) {
        return Task.where(" buscando el item " + item + " con envío a Colombia",
                Enter.theValue(item).into(INPUT_BARRA_BUSQUEDA).thenHit(Keys.ENTER),
                SeleccionarItem.conEnvioColombia()
        );
    }

    public static Performable conFiltroPrecio(String item, Integer valorMinimo, Integer valorMaximo) {
        return Task.where("buscando el item " + item + " con precio entre " + valorMinimo + " y " + valorMinimo,
                Enter.theValue(item).into(INPUT_BARRA_BUSQUEDA).thenHit(Keys.ENTER),
                Enter.theValue(String.valueOf(valorMinimo)).into(INPUT_PRECIO_VALOR_MINIMO),
                Enter.theValue(String.valueOf(valorMaximo)).into(INPUT_PRECIO_VALOR_MAXIMO),
                Click.on(BTN_FILTRO_PRECIO)
        );
    }

    ;

    public static Performable conFiltroMarca(String item) {
        return Task.where("buscando el item " + item + " por marca",
                Enter.theValue(item).into(INPUT_BARRA_BUSQUEDA).thenHit(Keys.ENTER),
                Click.on(BTN_FILTRO_MARCA)
        );
    }

    ;

    public static Performable conCategoriaLibro(String libro) {
        return Task.where("buscando el libro con titulo " + libro,
                Click.on(CATEGORIA),
                Click.on(SELECT_CATEGORIA),
                Enter.theValue(libro).into(INPUT_BARRA_BUSQUEDA).thenHit(Keys.ENTER)
        );
    }

    ;

}
