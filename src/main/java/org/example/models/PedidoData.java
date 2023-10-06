package org.example.models;

import lombok.Data;

import java.util.Map;
@Data
public class PedidoData {
    private String nombreCliente;
    private String fechaPedido;
    private String fechaRequerida;
    private String empleado;
    public static PedidoData pedidoData(Map<String, String> entry) {
        PedidoData pedidoData = new PedidoData();
        pedidoData.setNombreCliente(entry.get("nombreCliente"));
        pedidoData.setFechaPedido(entry.get("fechaPedido"));
        pedidoData.setFechaRequerida(entry.get("fechaRequerida"));
        pedidoData.setEmpleado(entry.get("empleado"));
        return pedidoData;
    }
}
