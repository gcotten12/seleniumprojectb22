package com.cybertek.Practice_Tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBears {
    WebDriver driver;

    /**
     * Open browser
     * 2. Go to website:
     * http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
     * 3. Enter username: “Tester”
     * 4. Enter password: “test”
     * 5. Click to Login button
     * 6. Print out count of all the links on landing page
     * 7. Print out each link text on this page
     */


    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void printLinks() {
        WebElement username = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        int count = 0;
        for (WebElement eachLink : allLinks) {
            System.out.println(eachLink.getText());
            count++;
        }
        System.out.println("There are " + count + " links on the landing page");

    }

}
