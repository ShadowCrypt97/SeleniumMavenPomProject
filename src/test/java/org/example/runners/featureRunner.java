package org.example.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/historia_usuario.feature",
        glue={"org/example/stepdefinitions"},
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome=true
)
public class featureRunner {
}
