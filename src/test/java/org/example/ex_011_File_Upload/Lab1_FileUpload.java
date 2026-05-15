package org.example.ex_011_File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab1_FileUpload
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");
        driver.manage().window().maximize();

        //Path maybe dynamic
        //WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));
        //uploadFileInput.sendKeys("E:/Vaish_Program/IntelliJ_Projects/LearningSelenium15xATB/src/test/java/org/example/ex_011_File_Upload/data.json");

        //So follow this steps
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));
        String user_dir_path = System.getProperty("user.dir");
        System.out.println(user_dir_path);
        uploadFileInput.sendKeys(user_dir_path + "/src/test/java/org/example/ex_011_File_Upload/data.json");

        driver.findElement(By.name("submit")).click();

        driver.quit();
    }
}
