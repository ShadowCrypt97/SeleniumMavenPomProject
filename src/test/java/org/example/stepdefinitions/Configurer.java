package org.example.stepdefinitions;

import io.cucumber.java.DataTableType;
import org.example.models.PedidoData;
import org.example.models.ProductoData;

import java.util.Map;

public class Configurer {
    @DataTableType
    public PedidoData pedidoData(Map<String, String> entry) {
        return PedidoData.pedidoData(entry);
    }
    @DataTableType
    public ProductoData productoData(Map<String, String> entry){return ProductoData.productoData(entry);}
}
