package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonToAll
{
    public ChromeDriver driver;

    public void openBrowser(WebDriver driver, String url)
    {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closeBrowser(WebDriver driver)
    {
        driver.quit();
    }

    public void waitForVisibility(WebDriver driver, int timeInSeconds, String xpath)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public void waitForJVM(int time)
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
