package org.example.ex_015_DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab2_TestDataDrivenTesting_Parallel
{
    @DataProvider(name = "LoginData", parallel = true)
    //@DataProvider(name = "LoginData", parallel = false)   //Can be a false    //By default false
    public Object[][] getData()
    {
        return new Object[][]
                {
                new Object[]{"admin@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass124"}
        };
    }


    @DataProvider(name = "LoginData2", parallel = true)
    public Object[][] getData2()
    {
        return new Object[][]
                {
                new Object[]{"admin@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass123"},
                new Object[]{"admin123@gmail.com", "pass124"}
        };
    }


    @Test(dataProvider = "LoginData")
    public void loginTest(String email, String password)
    {
        System.out.println(email + " | " + password);
    }


    @Test(dataProvider = "LoginData2")
    public void loginTest2(String email, String password)
    {
        System.out.println(email + " | " + password);
    }

}
