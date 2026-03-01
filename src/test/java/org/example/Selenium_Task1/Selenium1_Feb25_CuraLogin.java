package org.example.Selenium_Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium1_Feb25_CuraLogin
{

    @Test
    public static void cura_verify() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();


        WebElement make_appointment = driver.findElement(By.id("btn-make-appointment"));
        make_appointment.click();

        WebElement enter_name = driver.findElement(By.id("txt-username"));
        enter_name.sendKeys("John Doe");

        WebElement enter_pass = driver.findElement(By.id("txt-password"));
        enter_pass.sendKeys("ThisIsNotAPassword");

        WebElement click_login = driver.findElement(By.id("btn-login"));
        click_login.click();

        Thread.sleep(2000);

        //Assert.assertTrue(driver.getCurrentUrl().contains("appointment"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");

        //Thread.sleep(2000);

        String Appointment_Title = driver.findElement(By.tagName("h2")).getText();
        Assert.assertEquals(Appointment_Title, "Make Appointment");

        driver.quit();
    }
}
