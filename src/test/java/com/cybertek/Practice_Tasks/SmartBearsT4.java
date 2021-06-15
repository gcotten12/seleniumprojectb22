package com.cybertek.Practice_Tasks;

import com.cybertek.utilities.SmartBearUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmartBearsT4 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SmartBearUtils.loginToSmartBears(driver);
    }

    @Test
    public void test1(){
        SmartBearUtils.verifyOrder(driver, "Steve Johns");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
