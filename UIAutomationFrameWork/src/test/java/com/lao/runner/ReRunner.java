package com.lao.runner;


import org.junit.runner.RunWith;

import io.cucumber.core.plugin.RerunFormatter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/failedScenarios.txt", glue="stepDefinitions",plugin = {"html:target/report.html"} )


public class ReRunner {

}
