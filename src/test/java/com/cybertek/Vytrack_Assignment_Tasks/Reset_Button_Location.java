package com.cybertek.Vytrack_Assignment_Tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Reset_Button_Location {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/entity/Extend_Entity_Carreservation");
        WebElement user = driver.findElement(By.xpath("//input[@name='_username']"));
        user.sendKeys("user22");
        WebElement pass = driver.findElement(By.xpath("//input[@name='_password']"));
        pass.sendKeys("UserUser123"+ Keys.ENTER);

    }

    @Test
    public void task1() {

        /*
           We will verify that the refresh button is to the left of the reset button
           By using the get location method from Selenium library
           Then we will find the X and Y of the elements and compare them
           The X for refresh should be less than reset and the Y should be equal for both
         */

        // find the refresh button element
        WebElement refreshButton = driver.findElement(By.xpath("//a[@title='Refresh']"));
        Point locationOfRefreshButton = refreshButton.getLocation();

        // find the X and Y for the refresh button
        int xOfRefreshLocation = locationOfRefreshButton.getX();
        int yOfRefreshLocation = locationOfRefreshButton.getY();

        // System.out.println("locationOfRefreshButton = " + locationOfRefreshButton);

        // find the reset button element
        WebElement resetButton = driver.findElement(By.xpath("//a[@title='Reset']"));
        Point locationOfResetButton = resetButton.getLocation();

        // find the X and Y for the reset button
        int xOfResetLocation = locationOfResetButton.getX();
        int yOfResetLocation = locationOfResetButton.getY();

        // System.out.println("locationOfResetButton = " + locationOfResetButton);

        // verify that the X of refresh is less and the Y is the same for both
        Assert.assertTrue(xOfRefreshLocation < xOfResetLocation &&
                yOfRefreshLocation == yOfResetLocation);

    }

}
