package org.example.ex_013_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab1_Test_IFrame
{
    @Test
    public void test_Iframe()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        driver.switchTo().frame("result");
        driver.findElement(By.id("username")).sendKeys("Vaishnavi");

        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        //driver.findElement(By.cssSelector("button")).click();

        //If we want to switch to normal content or go all the way back to main frame
        //driver.switchTo().defaultContent();

        //Go back to parent window
        //driver.switchTo().parentFrame();

    }
}
