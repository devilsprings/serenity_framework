package com.dqhieu.testRunner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
    features = "src/test/resources/features/assignment.feature",
    glue = {"com.dqhieu"},
    monochrome = true)

public class demoTestSuite {}
