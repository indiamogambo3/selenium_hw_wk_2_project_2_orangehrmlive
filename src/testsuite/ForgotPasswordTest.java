package testsuite;

/**
 * 4. Write down the following test into
 * ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfully
 * * click on the ‘Forgot your password’ link
 * * Verify the text ‘Reset Password’
 */

import browsrefactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUpUrl() {

        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        //Find 'Forgot your password' element and click on 'Forgot your password' link
        driver.findElement(By.xpath("//p[text() = 'Forgot your password? ']")).click();
        //Verify the text 'Reset Password'
        String expectedText = "Reset Password";
        String actualText = driver.findElement(By.xpath("//h6[text() = 'Reset Password']")).getText();
        Assert.assertEquals("'Reset Password' not displayed correctly", expectedText, actualText);
    }

    @After
    public void tearDown() {

        closeBrowser();
    }

}
