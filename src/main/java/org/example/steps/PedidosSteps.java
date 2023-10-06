package org.example.steps;

import org.example.pageobjects.RegistrarPedidosPageObjects;
import org.example.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;

public class PedidosSteps {
    private final RegistrarPedidosPageObjects registrarPedidosPageObjects;

    public PedidosSteps() {
        this.registrarPedidosPageObjects = new RegistrarPedidosPageObjects();
        PageFactory.initElements(HelperClass.getDriver(),registrarPedidosPageObjects);
    }

    public void hacerClickCrearPedido(){
        registrarPedidosPageObjects.btnCrearPedido.click();
    }
}
