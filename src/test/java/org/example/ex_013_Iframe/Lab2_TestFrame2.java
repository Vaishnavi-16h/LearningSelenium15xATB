package org.example.ex_013_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab2_TestFrame2
{
    @Test
    public void test_frame()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        IFrameUtils frameUtils = new IFrameUtils(driver);

        frameUtils.switchToFrame("result");
        driver.findElement(By.id("username")).sendKeys("Pramod");
        frameUtils.switchToDefault();

    }
}