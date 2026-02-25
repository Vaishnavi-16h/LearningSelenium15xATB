package org.example.ex02_Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium11_DriverChange
{
    public static void main(String[] args)
    {
        WebDriver driver1 = new ChromeDriver();
        driver1 = new FirefoxDriver();
    }
}

