package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
     Creating the private constructor so this
     classes object is not reachable from the outside
     */
    private Driver() {}
    /*
    Making oue driver instance private so this is not reachable outside of the class
    Also we make it static because we are going to be using it in a static method, and
    we want it run before everything else
     */
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver == null) {
            String browserType = ConfigurationReader.getProperty("browser");

            switch(browserType) {
                case "chrome": WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox": WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "ie": WebDriverManager.iedriver().setup(); // internet explorer
                    driver = new InternetExplorerDriver();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }

        }

        return driver;

    }

    public static void closeDriver() {
        if(driver!=null) {
            driver.quit();
            driver=null;
        }
    }

}
