package com.google.capacitacion.googlesuite.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


import org.openqa.selenium.WebDriver;

import com.google.capacitacion.googlesuite.questions.LaPalabra;
import com.google.capacitacion.googlesuite.tasks.AbrirElNavegador;
import com.google.capacitacion.googlesuite.tasks.GoTo;
import com.google.capacitacion.googlesuite.tasks.Translate;
import com.google.capacitacion.googlesuite.userinterfaces.GoogleAppsComponent;
import com.google.capacitacion.googlesuite.userinterfaces.GoogleHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;


public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	
	private Actor christopher = Actor.named("Christopher");
	
	private GoogleHomePage googleHomePage;
	
	
	@Before
	public void setUp() {
		christopher.can(BrowseTheWeb.with(hisBrowser));
	}
	
	
	@Given("^que Christopher quiere traducir una palabra$")
	public void queChristopherQuiereTraducirUnaPalabra() throws Exception {							
		//precondiciones: Estar en google translate
		
		christopher.wasAbleTo(AbrirElNavegador.en(googleHomePage),	
		                              GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));                                               		
	}

	@When("^el traduce la plabra cheese de ingles a espanhol$")
	public void elTraduceLaPlabraCheeseDeInglesAEspanhol() throws Exception {
		christopher.wasAbleTo(Translate.the());
		
	   //condiciones: Traducir una palabra de ingles a español 
	}

	@Then("^el podra ver la palabra queso en la pantalla$")
	public void elPodraVerLaPalabraQuesoEnLaPantalla() throws Exception {
	    christopher.should(seeThat(LaPalabra.traducida(), equalTo("queso")));
	    
		//consecuencias: Aparece la palabra traducida
	}

}
