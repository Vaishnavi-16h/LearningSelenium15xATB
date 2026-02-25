package org.example.ex02_Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.*;
import org.testng.annotations.Test;

public class TestSelenium09_Assertion_TestNG
{
    @Test
     public void test_selenium_01()
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");

        //TestNG
        //Assert.assertEquals(driver.getCurrentUrl(),"https://google.com");
        //Assert.assertEquals(driver.getTitle(),"Google");

        //AsserJ
        assertThat(driver.getTitle()).isNotBlank().isNotEmpty().isNotNull().isEqualTo("Google");

        driver.quit();

    }
}