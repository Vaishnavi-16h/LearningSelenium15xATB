package org.example.Selenium_Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium2_Feb27_TTABank_signup
{
    @Test
    public void TTABank_SignUp() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
        driver.manage().window().maximize();
        Thread.sleep(2000);


        WebElement sign_up = driver.findElement(By.xpath("//button[normalize-space()='Sign Up']"));
        sign_up.click();

        WebElement Enter_name = driver.findElement(By.xpath("//input[@type='text']"));
        Enter_name.sendKeys("vaishnavi");

        WebElement Enter_email = driver.findElement(By.xpath("//input[@type='email']"));
        Enter_email.sendKeys("vaishnavihadkarautotest16@gmail.com");

        WebElement Enter_password = driver.findElement(By.xpath("//input[@type='password']"));
        Enter_password.sendKeys("TryTTA@1");

        WebElement Enter_create_acc = driver.findElement(By.xpath("//Button[@type='submit']"));
        Enter_create_acc.click();

        Thread.sleep(2000);

        WebElement Transfer_fund = driver.findElement(By.xpath("//button[normalize-space()='Transfer Funds']"));
        Transfer_fund.click();

        WebElement Enter_amt = driver.findElement(By.xpath("//input[@type='number']"));
        Enter_amt.sendKeys("5000");

        WebElement Continue_Transfer = driver.findElement(By.xpath("//button[normalize-space()='Continue']"));
        Continue_Transfer.click();

        WebElement Confirm_Transfer = driver.findElement(By.xpath("//button[normalize-space()='Confirm Transfer']"));
        Confirm_Transfer.click();

        WebElement GoTo_Dashboard = driver.findElement(By.xpath("//button[normalize-space()='Dashboard']"));
        GoTo_Dashboard.click();


        String Total_Bal= driver.findElement(By.xpath("//h3[contains(text(),'$')]")).getText();
        Assert.assertEquals(Total_Bal,"$45,000.00");

//        OR
//        WebElement Actual_Bal= driver.findElement(By.xpath("//h3[contains(text(),'$')]"));
//        String New_Bal=Actual_Bal.getText();
//        String ExpectedBal= "$45,000.00";
//        Assert.assertEquals(New_Bal,ExpectedBal);


        driver.quit();

    }
}
