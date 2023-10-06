package org.example.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrarPedidosPageObjects {
    @FindBy(css = "span>i.fa-plus-circle")
    public WebElement btnCrearPedido;
}
