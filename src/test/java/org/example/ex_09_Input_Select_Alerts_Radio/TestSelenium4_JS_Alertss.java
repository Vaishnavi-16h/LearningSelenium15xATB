package org.example.ex_09_Input_Select_Alerts_Radio;

import org.example.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.WaitHelpers.waitJVM;

public class TestSelenium4_JS_Alertss extends CommonToAll
{
    @Test
    public void test_Alerts2()
    {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        WebElement elementConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        WebElement elementPrompt= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));


        //elementConfirm.click();
        elementPrompt.click();

        waitForAlert(driver,5);

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("PRAMOD");
        alert.accept();
        //alert.dismiss();

        String result = driver.findElement(By.id("result")).getText();
        //Assert.assertEquals(result,"You clicked: Ok");
        Assert.assertEquals(result,"You entered: PRAMOD");

        waitJVM(5000);
        closeBrowser(driver);

    }

}