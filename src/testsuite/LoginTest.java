package testsuite;

import browsrefactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValidCredentials
 * * Enter “Admin” username
 * * Enter “admin123 password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Dashboard’ text is display
 */

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUpUrl() {

        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        //Find 'Username' element and enter valid username in 'Username' field
        driver.findElement(By.name("username")).sendKeys("Admin");
        //Find 'Password' element and enter valid password in 'Password' field
        driver.findElement(By.name("password")).sendKeys("admin123");
        //Find 'Login' button element and click on 'Login' button
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
        //Verify the text 'Dashboard' is displayed correctly
        String expectedText = "Dashboard";
        String actualText = driver.findElement(By.xpath("//h6[text() = 'Dashboard']")).getText();
        Assert.assertEquals("Text 'Dashboard' not displayed correctly.", expectedText, actualText);

    }


    @After
    public void tearDown() {

        closeBrowser();
    }

}
