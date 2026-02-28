package org.example.ex03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium15
{
    @Test
    public static void app_vwo_com() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        //Locators
        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password and enter the 1234.
        // Step 3 - Find the Submit and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.

        // 1. Find the EMAIL ID and enter the admin@admin.com.
//        <input type="email"
//        class="text-input W(100%)"
//        name="username"
//        vwo-html-translate-attr="placeholder"
//        vwo-html-translate-placeholder="login:enterEmailID"
//        id="login-username"
//        data-qa="hocewoqisi"
//        placeholder="Enter email ID">

        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");

        // 2. Find the password inputbox and enter the password
//         <input
//         type="password"
//         class="text-input W(100%)"
//         name="password"
//         id="login-password"
//         data-qa="jobodapuxe">

        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("wrongpass@123");

        // 3. Find the submit button and click on it.
//         <button
//         type="submit"
//         id="js-login-btn"
//         class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
//         onclick="login.login(event)"
//         data-qa="sibequkica"
//         >

        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_button.click();

        // 4.  Wait some time.
        Thread.sleep(5000);

        // 5. Verify the message error message.
//        <div
//        class="notification-box-description"
//        data-qa="rixawilomi">
//        Your email, password, IP address or location did not match
//        </div>

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());


        //Assertion
        // error_message - AR (actual result)
        // "Your email, password, IP address or location did not match" - ER (Expected result)
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

       driver.quit();

    }
}
