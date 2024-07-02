package org.example.baseTest;

import org.example.drivers.DriverManager;
import org.example.drivers.DriverManagerTL;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    @BeforeMethod
    public void setUp() throws Exception {
        DriverManagerTL.init();
    }


    @AfterMethod
    public void tearDown() throws Exception {
        DriverManagerTL.down();
    }
}
