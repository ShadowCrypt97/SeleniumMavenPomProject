package org.example.steps;

import org.example.pageobjects.LoginPageObjects;
import org.example.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;
public class LoginSteps {
    private LoginPageObjects loginPageObjects;
    private String userName;

    public LoginSteps() {
        this.loginPageObjects = new LoginPageObjects();
        PageFactory.initElements(HelperClass.getDriver(),loginPageObjects);
    }

    public void getLogin(String username, String password) {
        loginPageObjects.userName.clear();
        loginPageObjects.password.clear();
        loginPageObjects.userName.sendKeys(username);
        loginPageObjects.password.sendKeys(password);
        loginPageObjects.loginBtn.click();
    }
}
