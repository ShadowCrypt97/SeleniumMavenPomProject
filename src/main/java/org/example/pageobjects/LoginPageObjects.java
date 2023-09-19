package org.example.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
    @FindBy(name = "Username")
    public WebElement userName;

    @FindBy(name = "Password")
    public WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Iniciar sesión')]")
    public WebElement loginBtn;
}
