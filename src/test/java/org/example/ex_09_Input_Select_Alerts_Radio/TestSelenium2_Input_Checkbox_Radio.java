package org.example.ex_09_Input_Select_Alerts_Radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium2_Input_Checkbox_Radio
{
    @Test
    public void test_HTMLTags()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("The Testing Academy");

        WebElement radiobox = driver.findElement(By.id("sex-1"));
        radiobox.click();

        WebElement checkbox = driver.findElement(By.id("tool-1"));
        checkbox.click();

        driver.quit();
    }
}
