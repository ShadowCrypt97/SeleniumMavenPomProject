package org.example.models;

import lombok.Data;

import java.util.Map;

@Data
public class ProductoData {
    private String nombreProducto;
    private String precio;
    private String cantidad;
    private String descuento;
    public static ProductoData productoData(Map<String, String> entry) {
        ProductoData productoData = new ProductoData();
        productoData.setNombreProducto(entry.get("nombreProducto"));
        productoData.setPrecio(entry.get("precio"));
        productoData.setCantidad(entry.get("cantidad"));
        productoData.setDescuento(entry.get("descuento"));
        return productoData;
    }
}
