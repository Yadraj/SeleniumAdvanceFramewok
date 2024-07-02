package org.example.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;

public class DriverManagerTL {


    public static  ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return dr.get();
    }


    public static void setDriver(WebDriver driver) {
        dr.set(driver);
    }

    public static void unload() {
        dr.remove();
    }


    public static void down() {
        if(Objects.nonNull(DriverManagerTL.getDriver())) {
            getDriver().quit();
            unload();
        }

    }


    public static void init(){

        if(Objects.isNull(DriverManagerTL.getDriver())){

            //ChromeOptions options = new ChromeOptions();
            //options.addArguments("--guest");
             WebDriver driver = new ChromeDriver();
             setDriver(driver);

        }
    }
}
