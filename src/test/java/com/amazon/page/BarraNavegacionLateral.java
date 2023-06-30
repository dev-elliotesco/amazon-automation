package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BarraNavegacionLateral {
    public static Target BTN_BARRA_NAVEGACION = Target.the("boton barra navegacion lateral").located(By.id("nav-hamburger-menu"));
    public static Target BTN_BARRA_REGION = Target.the("boton region dentro de barra navegacion lateral").locatedBy("//a[@href=\"/customer-preferences/country/?ref_=nav_em_locale_0_1_1_37\"]");
    public static Target BTN_APP_STORE = Target.the("boton para seleccionar app store").locatedBy("//a[@data-menu-id='4']");
    public static Target BTN_TODAS_APPS = Target.the("boton para ir a app store").locatedBy("//a[text()='All Apps and Games ']");

}
