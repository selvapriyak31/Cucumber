package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

    @RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Features1/login1.feature",glue="org.stepdefintion1")
	public class TestRunner1 {

	}



