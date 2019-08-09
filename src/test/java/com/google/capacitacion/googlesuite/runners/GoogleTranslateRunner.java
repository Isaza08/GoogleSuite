package com.google.capacitacion.googlesuite.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resoruces\\features\\GoogleTranslate.feature",
				 glue = "com.google.capacitacion.googlesuite.stepdefinitions",
				 snippets = SnippetType.CAMELCASE)


public class GoogleTranslateRunner {

	
}
