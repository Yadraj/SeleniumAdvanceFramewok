package org.example.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverManager {



    //static methods ---shared by all the test cases
    //Thread class ----1 class or test per driver

    static WebDriver driver;



    public static void init(){
        if(driver ==  null){
            new ChromeDriver();
        }
    }


    public  static WebDriver getDriver(){
        return driver;
    }




    public static void quit()
    {
        if(driver != null){
            driver.quit();
            driver=null;
        }
    }


}
