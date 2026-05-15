package org.example.Selenium_Task1;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium5_March6_flipkart_GreaterPrice extends CommonToAll
{
    @Test
    public void navigateMAC_and_find_cheapestMAC()
    {
        driver = new ChromeDriver();
        openBrowser(driver , "https://www.flipkart.com/search");

        List<WebElement> priceList = driver.findElements(By.xpath("//div[@class = 'hZ3P6w']"));

        //Now convert the price to Integer to find the min value
        int minPrice = Integer.MAX_VALUE;
        for(WebElement price : priceList)
        {
            String fullList = price.getText();
            //System.out.println(fullList);
            fullList = fullList.replace("₹","").replace(",","");

            int value = Integer.parseInt(fullList);
            if(value < minPrice)
            {
                minPrice = value;
            }
        }
        System.out.println("Min Price: ₹" + minPrice);
        closeBrowser(driver);

    }
}

