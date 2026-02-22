package org.example;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium03
{
    public static void main(String[] args)
    {
        //Selenium : 3
        //System.getProperty("webdriver.gecko.driver","/path/geckodriver");

        FirefoxDriver driver = new FirefoxDriver();
        // new FirefoxDriver(); - This START of the Selenium Session
        // Session - Fresh copy of browser is started!.
        // POST request to the Server - Firefox Driver.

        driver.get("https://sdet.live");
        // Command number 2 - POST request to give to the driver to navigate to a URL

    }
}
