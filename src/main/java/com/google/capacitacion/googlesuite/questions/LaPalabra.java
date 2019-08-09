package com.google.capacitacion.googlesuite.questions;

import com.google.capacitacion.googlesuite.userinterfaces.GoogleTranslatePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaPalabra implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		String palabra = Text.of(GoogleTranslatePage.TARGET_LANGUAGE_RESULT).viewedBy(actor).asString();
		StringBuilder sb = new StringBuilder(palabra);
		sb.deleteCharAt(5);
		sb.deleteCharAt(5);
	
		return sb.toString();
	}

	public static LaPalabra traducida() {
		
		return new LaPalabra();
	}
	
	

}
