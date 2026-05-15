package org.example.ex_10_Actions_Class;

import org.example.CommonToAll;
import org.example.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.util.List;
import static org.example.WaitHelpers.waitJVM;

public class Lab3_ActionClass_MakeMyTRIP extends CommonToAll
{
    @Test
    public void test_makemytrip_flights()
    {
        WebDriver driver = new FirefoxDriver();
        openBrowser(driver,"https://www.makemytrip.com/");


        WaitHelpers.checkVisibility(driver,By.xpath("//span[@data-cy='closeModal']"),5);
        WebElement signup_model = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        signup_model.click();

        //myra AI chat box
        //WaitHelpers.checkVisibility(driver,By.xpath("//img[@alt='minimize']"),5);
        //WebElement ai_model = driver.findElement(By.xpath("//img[@alt='minimize']"));
        //ai_model.click();


        // just to remove the transparent layer.
        WebElement background_element = driver.findElement(By.tagName("body"));
        background_element.click(); // just to remove the transparent layer.

        waitJVM(3000);

        //From City
        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy='fromCity']"));
        Actions actions = new Actions(driver);

        //actions.moveToElement(fromCity).click().build().perform(); //extra
        //waitJVM(2000);                                             //extra

        actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();

        waitJVM(2000);

        try
        {
            List<WebElement> list_auto_complete_dropdown = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
            for(WebElement suggestions: list_auto_complete_dropdown)
            {
                if(suggestions.getText().contains("Chandigarh"))
                {
                    suggestions.click();
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }




        //To City
        WebElement toCity = driver.findElement(By.xpath("//input[@data-cy='toCity']"));
        actions.moveToElement(toCity).click().sendKeys("DEL").build().perform();

        try
        {
            List<WebElement> list_auto_complete2=  driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
            for(WebElement suggestion2 : list_auto_complete2)
            {
                if(suggestion2.getText().contains("Del"))
                {
                    suggestion2.click();
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
}