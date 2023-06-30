package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class IdiomaPage {
    public static Target BTN_DE= Target.the("boton idioma").locatedBy("//input[@value='de_DE']");
    public static Target BTN_GUARDAR_IDIOMA= Target.the("boton guardar idioma").locatedBy("//span[@class='a-button-inner']//input");
}
