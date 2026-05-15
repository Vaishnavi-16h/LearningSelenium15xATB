package org.example.Selenium_Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium4_March4_AppVWO_Login
{
    @Test
    public void test_vwo_login() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        WebElement input_email = driver.findElement(By.xpath("//input[@placeholder='Enter email ID']"));
        input_email.sendKeys("admin@admin.com");

        WebElement input_pass = driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
        input_pass.sendKeys("admin");

        WebElement click_login = driver.findElement(By.xpath("//button[@type='submit']"));          //or    //WebElement click_login = driver.findElement(By.xpath("//button"));
        click_login.click();

        //Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement error_msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));

        //WebElement error_msg=driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        System.out.println(error_msg.getText());

        driver.quit();

    }
}
