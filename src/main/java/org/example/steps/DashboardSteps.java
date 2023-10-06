package org.example.steps;

import org.example.pageobjects.DashboardPageObjects;
import org.example.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;
import static org.example.utils.Constants.POLLING_INTERVAL;
import static org.example.utils.Constants.TIMEOUT;

public class DashboardSteps {
    private DashboardPageObjects dashboardPageObjects;


    public DashboardSteps() {
        this.dashboardPageObjects = new DashboardPageObjects();
        PageFactory.initElements(HelperClass.getDriver(),dashboardPageObjects);
    }

    public String getDashboardTitle(){
        return dashboardPageObjects.dashboardTitle.getText();
    }
    public void clickOnNorthwindModule(){
        HelperClass.webDriverFluentWait(TIMEOUT,POLLING_INTERVAL,dashboardPageObjects.northwindModule).click();
    }

    public void clickOnPedidosSubmodule(){
        HelperClass.webDriverFluentWait(TIMEOUT,POLLING_INTERVAL,dashboardPageObjects.pedidosModule).click();
    }
}
