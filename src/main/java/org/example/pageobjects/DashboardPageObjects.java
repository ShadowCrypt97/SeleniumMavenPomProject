package org.example.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPageObjects {
    @FindBy(xpath = "//h1[contains(text(),'Tablero')]")
    public WebElement dashboardTitle;

    @FindBy(xpath = "//span[text()='Pedidos']")
    public WebElement pedidosModule;
    @FindBy(xpath = "//span[text()='Northwind']")
    public WebElement northwindModule;
}
