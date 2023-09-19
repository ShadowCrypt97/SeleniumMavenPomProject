package org.example.steps;

import org.example.pageobjects.DashboardPageObjects;
import org.example.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;

public class DashboardSteps {
    private DashboardPageObjects dashboardPageObjects;

    public DashboardSteps() {
        this.dashboardPageObjects = new DashboardPageObjects();
        PageFactory.initElements(HelperClass.getDriver(),dashboardPageObjects);
    }

    public String getDashboardTitle(){
        return dashboardPageObjects.dashboardTitle.getText();
    }
}
