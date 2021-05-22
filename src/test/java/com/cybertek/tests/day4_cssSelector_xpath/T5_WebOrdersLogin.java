package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class T5_WebOrdersLogin {

    public static void main(String[] args) {

        /**
         * TC #5:	Basic	login	authentication
         * 1- Open	a	chrome	browser
         * 2- Go	to:
         * http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
         * 3- Verify	title	equals:
         * Expected:	Web	Orders	Login
         * 4- Enter	username:	Tester
         * 5- Enter	password:	test
         * 6- Click	“Sign	In”	button
         * 7- Verify	title equals:
         * Expected:	Web	Orders
         */

        // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Web Orders Login";
        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification Passed");
        }else {
            System.out.println("Title Verification Failed");
        }

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test" + Keys.ENTER);
//        driver.findElement(By.className("button")).click();




    }

}
