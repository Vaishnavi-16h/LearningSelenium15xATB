package org.example.ex_04_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium21_MiniProject_04
{
    @Test
    public void TestSelenium21_MiniProject_04() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

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


        //List<WebElement> alt_images = driver.findElements(By.xpath("//img[starts-with(@alt,\"Image\")]"));
        //alt_images.get(0).click();


        driver.quit();

    }
}
