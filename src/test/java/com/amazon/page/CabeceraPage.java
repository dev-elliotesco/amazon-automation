package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CabeceraPage {
    public static Target INPUT_BARRA_BUSQUEDA = Target.the("barra de busqueda").located(By.id("twotabsearchtextbox"));
    public static Target BUT_CARRITO = Target.the("boton carrito").located(By.id("nav-cart"));
    public  static Target CATEGORIA = Target.the("boton carrito").locatedBy("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']");
    public  static Target SELECT_CATEGORIA = Target.the("boton carrito").locatedBy("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']/option[text()='Books']");
    public static Target BTN_IDIOMA = Target.the("boton carrito").locatedBy("//span[@class='icp-nav-flag icp-nav-flag-us icp-nav-flag-lop']");
}
