package com.google.capacitacion.googlesuite.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.google.capacitacion.googlesuite.userinterfaces.GoogleTranslatePage;


import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Translate implements Task {
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_OPTION),
				Click.on(GoogleTranslatePage.SOURCE_LANGUAGE),
				Click.on(GoogleTranslatePage.TARGET_LANGUAGE_OPTION),
				Click.on(GoogleTranslatePage.TARGET_LAGUAGE),
				Enter.theValue("cheese").into(GoogleTranslatePage.SOURCE_LANGUAGE_TEXTAREA));
		
	}
	
	public static Translate the(){
		return instrumented(Translate.class);
		
	}

}
