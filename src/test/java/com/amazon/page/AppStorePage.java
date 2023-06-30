package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class AppStorePage {
    public static Target RECOMENDED_APPS_GAMES = Target.the("subtitulo de pagina app store").locatedBy("//span[@class='acswidget-carousel__title']");
}
