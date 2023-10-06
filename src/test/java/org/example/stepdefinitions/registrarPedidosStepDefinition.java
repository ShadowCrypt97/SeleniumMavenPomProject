package org.example.stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.models.PedidoData;
import org.example.models.ProductoData;
import org.example.steps.DashboardSteps;
import org.example.steps.LoginSteps;
import org.example.steps.PedidosSteps;
import org.example.utils.HelperClass;

import java.util.List;
import java.util.Map;

import static org.example.utils.Constants.LOGIN_URL;

public class registrarPedidosStepDefinition {
    private final LoginSteps loginSteps = new LoginSteps();
    private final DashboardSteps dashboardSteps = new DashboardSteps();
    private final PedidosSteps pedidosSteps = new PedidosSteps();
    @Given("que hago login con usuario {string} y clave {string}")
    public void queHagoLoginConUsuarioYClave(String username, String password) {
        HelperClass.openPage(LOGIN_URL);
        loginSteps.getLogin(username,password);
    }

    @Given("que me encuentro en el modulo de pedidos")
    public void queMeEncuentroEnElModuloDePedidos() {
        dashboardSteps.clickOnNorthwindModule();
        dashboardSteps.clickOnPedidosSubmodule();
    }

    @When("registre un nuevo pedido")
    public void registreUnNuevoPedido(List<PedidoData> listDatosPedido) {
        pedidosSteps.hacerClickCrearPedido();
    }

    @And("registre los productos al pedido")
    public void registreLosProductosAlPedido(List<ProductoData> listProductoData) {

    }

    @And("sea registrado exitosamente")
    public void seaRegistradoExitosamente() {
    }

    @Then("debo visualizar")
    public void deboVisualizar() {
    }

    @Then("debo visualizar los productos añadidos en el listado")
    public void deboVisualizarLosProductosAnadidosEnElListado() {
    }

    @And("debo verificar que se calcule correctamente el total con descuento")
    public void deboVerificarQueSeCalculeCorrectamenteElTotalConDescuento() {
    }
}
