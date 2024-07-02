package org.example.pages.pageObjectModel;

import org.example.base.BasePage;
import org.example.drivers.DriverManagerTL;
import org.example.utils.PropertyReader;
import org.openqa.selenium.By;

public class LoginPage_POM extends BasePage {

    public LoginPage_POM(){
        super();                //To call basePage Constructor
    }


    //page Locators
     By username = By.id("login-username");
     By password = By.id("login-password");
     By sign = By.id("js-login-btn");

    //Page Actions
    public LoginPage_POM loginTovwoPositive() throws Exception {

        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password,PropertyReader.readKey("password"));
        clickElement(sign);
        return this;             //To pass the control to dashboard page


    }


    public void openUrl(String url) throws Exception {
        DriverManagerTL.getDriver().get(url);
    }


    public void loginTovwoNegative() throws Exception {

        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password,PropertyReader.readKey("password"));
        clickElement(sign);

    }

public DashboardPage_POM afterLogin(){
        return  new DashboardPage_POM();
}





}
