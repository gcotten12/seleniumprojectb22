package com.cybertek.Office_Hours.day_5_26_21;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MoneyGaming {

    /**
     * REAL JOB INTERVIEW TASK
     *         1. Navigate to: https://moneygaming.qa.gameaccount.com/
     *         2. Click the JOIN NOW button to open the registration page
     *         3. Select a title value from the dropdown
     *         4. Enter your first name and surname in the form
     *         5. Check the tickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18.'
     *         6. Submit the form by clicking the JOIN NOW button
     *         7. Validate that a validation message with text ‘ This field is required’ appears under the date of
     *         birth box
     */

    @Test
    public void Task1() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://moneygaming.qa.gameaccount.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement joinNowButton = driver.findElement(By.xpath("//a[.='Join Now!']"));
        joinNowButton.click();

        // select a title value from the dropdown
        WebElement titleElement = driver.findElement(By.id("title"));

        // we need to create our select object so we can reach select class method
        Select titleDropDown = new Select(titleElement);

        // we are going to add a Mr to gaming
        titleDropDown.selectByVisibleText("Mr");

        // verify that Mr is selected
        String expectedTitle = "Mr";
        String actualTitle = titleDropDown.getFirstSelectedOption().getText();

        // verifying title using assertion
        Assert.assertEquals(actualTitle,expectedTitle, "verify the title");

        // locate first name field and enter first name
        WebElement firstName = driver.findElement(By.xpath("//input[@id='forename']"));
        firstName.sendKeys("Garrett");

        // locate surname field and enter surname
        WebElement surname = driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        surname.sendKeys("cotten");

        // check the tickbox
        WebElement tickBox = driver.findElement(By.xpath("//input[@class='required checkbox terms']"));
        tickBox.click();

        // submit by clicking the join now button
        WebElement submitForm = driver.findElement(By.xpath("//input[@alt='Join Now']"));
        submitForm.click();

        // validate that a validation message with text 'This field is required' appears under date of birth box
        String actualError = driver.findElement(By.xpath("//label[@for='dob']")).getText();
        String expectedError = "This field is required";

        Assert.assertEquals(actualError,expectedError, "verify date of birth error message");

    }


}
