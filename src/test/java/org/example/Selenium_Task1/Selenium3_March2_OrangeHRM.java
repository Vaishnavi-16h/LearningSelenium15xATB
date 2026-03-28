package org.example.Selenium_Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium3_March2_OrangeHRM
{
    @Test
    public void test_OHRM_login_terminate() throws InterruptedException
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

        Thread.sleep(3000);

        List<WebElement> First_TerminatedEmp = driver.findElements(By.xpath("//div[text()='Terminated']"));
        WebElement First_TerminatedEmpName = driver.findElement(By.xpath("//div[contains(text(),'Terminated')]/../preceding-sibling::div[3]"));
        System.out.println(First_TerminatedEmpName.getText());
        WebElement DeleteFirst_terminatedEmp = driver.findElement(By.xpath( "//div[text()='Terminated']/following::i[1]"));
        DeleteFirst_terminatedEmp.click();


//        WebElement emp_list = driver.findElement(By.xpath("//a[contains(text(), 'Employee List')]"));
//        List <WebElement> terminated_emp = driver.findElements(By.xpath("//div[@role='row']/div[@role='cell']/div[text()='Terminated']"));
//        WebElement dlt_button = driver.findElement(By.xpath("//div[@role='row']/div[@role='cell']/div[text()='Terminated'][1]/ancestor::div[@role='row']/div[9]/div/button[@type='button']/i[@class=\"oxd-icon bi-trash\"][1]"));
//        dlt_button.click();


        driver.quit();

    }
}


