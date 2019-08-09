package com.google.capacitacion.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	
	public static final Target SOURCE_LANGUAGE_OPTION = Target.the("Source language button").locatedBy("//div[@class='sl-more tlid-open-source-language-list']");
	public static final Target TARGET_LANGUAGE_OPTION = Target.the("Target language button").locatedBy("//div[@class='tl-more tlid-open-target-language-list']");
	public static final Target SOURCE_LANGUAGE = Target.the("Source language").locatedBy("//*[contains(@class, 'sl_list_en_checkmark')]/following-sibling::div[contains(text(),'inglés')]");
	public static final Target TARGET_LAGUAGE = Target.the("Source language").locatedBy("//*[contains(@class, 'tl_list_es_checkmark')]/following-sibling::div[contains(text(),'español')] ");
	public static final Target SOURCE_LANGUAGE_TEXTAREA = Target.the("Source language textarea").located(By.id("source"));
	public static final Target TARGET_LANGUAGE_RESULT = Target.the("Target language result area").locatedBy("//div[@class='result tlid-copy-target']");
}
