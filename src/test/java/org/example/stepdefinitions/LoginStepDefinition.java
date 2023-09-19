package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.steps.DashboardSteps;
import org.example.steps.LoginSteps;
import org.example.utils.HelperClass;
import org.junit.Assert;

import static org.example.utils.Constants.LOGIN_URL;

public class LoginStepDefinition {
    private final LoginSteps loginSteps = new LoginSteps();
    private final DashboardSteps dashboardSteps = new DashboardSteps();
    @Given("que ingreso a la pagina de StarSharp")
    public void queIngresoALaPaginaDeStarSharp() {
        HelperClass.openPage(LOGIN_URL);
    }

    @When("ingrese mis credenciales usuario {string} y clave {string}")
    public void ingreseMisCredencialesUsuarioYClave(String username, String password) {
        loginSteps.getLogin(username,password);
    }
    @Then("debo ver el dashboard")
    public void deboVerElDashboard() {
        Assert.assertEquals("Debo ver el mensaje del Dashboard","Tablero",dashboardSteps.getDashboardTitle());
    }


}
