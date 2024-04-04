package com.lao.runner;

import org.junit.runner.RunWith;

import io.cucumber.core.plugin.RerunFormatter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/CEONameVerification.feature", glue="stepDefinitions",plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/report.html","rerun:target/failedScenarios.txt"} )
public class TestRunner {

}
