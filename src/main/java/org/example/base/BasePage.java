package org.example.base;

import org.example.drivers.DriverManager;
import org.example.drivers.DriverManagerTL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {

    //Common Funtions to all pages

    public BasePage(){

    }


    public void implicitWait(){

        DriverManagerTL.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public void clickElement(By by){
        DriverManagerTL.getDriver().findElement(by).click();
    }


    public WebElement presenceOfElement(final By elementLocator){
        return new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(elementLocator));

    }

    public WebElement visibilityOfElement(final By elementLocator){
        return new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(elementLocator));

    }

    protected  void enterInput (By by , String key ){
        DriverManagerTL.getDriver().findElement(by).sendKeys(key);
    }


    protected  WebElement getElement (By  key ){
        return DriverManagerTL.getDriver().findElement(key);
    }



}
