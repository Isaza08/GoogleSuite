package com.google.capacitacion.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {
	
	public static final Target GOOGLE_APPS = Target.the("GoogleAppsButton").located(By.id("gbwa"));
	public static final Target GOOGLE_TRANSLATE = Target.the("GoogleTranslateOption").located(By.id("gb51"));

}
