package org.example.ex_07_Selenium_Waits;

import io.qameta.allure.Description;
import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSeleniumExplicit_MiniProject4 extends CommonToAll
{

    @Description("Verify makemytrip opens with modal")
    @Test
    public void testCloseModal()
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.makemytrip.com/");


//        //span[@data-cy='closeModal']
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));
//

        waitForVisibility(driver,3,"//span[@data-cy='closeModal']");

        WebElement closeModel = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closeModel.click();

        waitForJVM(10000);
        closeBrowser(driver);

    }

}