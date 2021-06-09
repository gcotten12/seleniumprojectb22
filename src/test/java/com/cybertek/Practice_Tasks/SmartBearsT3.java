package com.cybertek.Practice_Tasks;

import com.cybertek.utilities.SmartBearUtils;
import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmartBearsT3 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /**
     * 6. Click on Order
     * 7. Select familyAlbum from product, set quantity to 2
     * 8. Click to “Calculate” button
     * 9. Fill address Info with JavaFaker
     * • Generate: name, street, city, state, zip code
     * 10.Click on “visa” radio button
     * 11.Generate card number using JavaFaker
     * 12.Click on “Process”
     * 13.Verify success message “New order has been successfully added.”
     */

    @Test
    public void softwareOderPlacing() throws InterruptedException {
        SmartBearUtils.loginToSmartBears(driver);
        // find Order link WebElement
        WebElement order = driver.findElement(By.xpath("//a[.='Order']"));
        order.click();

        Faker faker = new Faker();
        String name = faker.name().fullName();
        String street = faker.address().streetAddress();
        String city = faker.address().city();
        String state = faker.address().state();
        String zipCode = "12345";
        String cardNum = "1234212112211211";
        String expDate = "10/10";

        WebElement quantityField = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
        quantityField.clear();
        quantityField.sendKeys("10" + Keys.ENTER);

        WebElement customerName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));
        customerName.sendKeys(name);
        WebElement streetField = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']"));
        streetField.sendKeys(street);
        WebElement cityField = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']"));
        cityField.sendKeys(city);
        WebElement stateField = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']"));
        stateField.sendKeys(state);
        WebElement zipCodeField = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']"));
        zipCodeField.sendKeys(zipCode);

        WebElement visaButton = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_fmwOrder_cardList']//td//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
        visaButton.click();

        WebElement cardNumberField = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));
        cardNumberField.sendKeys(cardNum);

        WebElement cardExpDate = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']"));
        cardExpDate.sendKeys(expDate);

        WebElement submitButton = driver.findElement(By.xpath("//a[.='Process']"));
        submitButton.click();

        WebElement successMessage = driver.findElement(By.xpath("//strong"));

        Assert.assertTrue(successMessage.isDisplayed());

    }



}
