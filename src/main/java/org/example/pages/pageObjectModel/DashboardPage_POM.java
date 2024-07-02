package org.example.pages.pageObjectModel;

import org.example.base.BasePage;
import org.openqa.selenium.By;

public class DashboardPage_POM  extends BasePage {

    public DashboardPage_POM(){

    }



    By userNameOnDashboard = By.xpath("//span[text()='yadraj shinde']");

    public String loggedInUserNameOnDashboard(){
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }


}
