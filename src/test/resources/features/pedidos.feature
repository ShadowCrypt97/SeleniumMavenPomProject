#Author : Sergio  Andrés Gómez Roa

Feature: Yo como usuario de la pagina Star Sharp
  Quiero realizar nuevos pedidos
  Para poder visualizarlo en el listado de pedidos

  Background:
    Given que hago login con usuario "admin" y clave "serenity"

  @Scenario1
  Scenario: verificar productos agregados al pedido
    Given que me encuentro en el modulo de pedidos
    When registre un nuevo pedido
    |nombreCliente                             |fechaPedido|fechaRequerida|empleado       |
    |Ana Trujillo Emparedados y helados [ANATR]|5/10/2023|9/10/2023   |Andrew Fuller|
    And registre los productos al pedido
    |nombreProducto|precio|cantidad|descuento|
    |Chang         | 15   |2       |5        |
    Then debo visualizar los productos añadidos en el listado
    And debo verificar que se calcule correctamente el total con descuento

