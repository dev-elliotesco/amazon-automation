package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegionPage {
    public static Target SELECT_REGION = Target.the("select con regiones").locatedBy("//span[@id=\"icp-dropdown\"]//span[@class=\"a-dropdown-prompt\"]");
    public static Target REGION = Target.the("region selecionada").located(By.id("icp-dropdown_3"));
    public static Target BTN_REGION_NUEVA = Target.the("ir a region selecionada").locatedBy("//span[@id=\"icp-save-button\"]//input[@class=\"a-button-input\"]");
}
