package org.example;

import org.openqa.selenium.WebDriver;

public class TestSelenium05_WebDriver
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://sdet.live");
    }
}
