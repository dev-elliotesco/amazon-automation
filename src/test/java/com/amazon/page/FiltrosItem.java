package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FiltrosItem {
    public static Target INPUT_PRECIO_VALOR_MINIMO = Target.the("valor minimo de precio").located(By.id("low-price"));
    public static Target INPUT_PRECIO_VALOR_MAXIMO = Target.the("valor maximo de precio").located(By.id("high-price"));
    public static Target BTN_FILTRO_PRECIO = Target.the("boton para filtrar producto por precio").locatedBy("//input[@id='high-price']/following-sibling::*//input");
    public static Target BTN_FILTRO_MARCA = Target.the("boton para filtrar producto por marca").locatedBy("//a[@class='a-link-normal s-navigation-item']//span[text()='SAMSUNG']");
}
