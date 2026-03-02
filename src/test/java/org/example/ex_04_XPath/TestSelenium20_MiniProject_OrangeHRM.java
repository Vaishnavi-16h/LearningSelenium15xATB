package org.example.ex_04_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium20_MiniProject_OrangeHRM
{
    @Test
    public void test_OHRM_login() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement input_name = driver.findElement(By.xpath("//input[@name='username']"));
        input_name.sendKeys("admin");

        WebElement input_password = driver.findElement(By.xpath("//input[@type='password']"));
        input_password.sendKeys("Hacker@4321");

        WebElement click_login = driver.findElement(By.xpath("//button[@type='submit']"));          //or    //WebElement click_login = driver.findElement(By.xpath("//button"));
        click_login.click();

        Thread.sleep(2000);

        WebElement H6 = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6"));

        Assert.assertEquals(H6.getText(),"PIM");

        driver.quit();

    }
}
