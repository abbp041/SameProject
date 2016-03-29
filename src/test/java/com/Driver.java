package com;




import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Ibi on 04/02/2016.
 */
public class Driver {


    public WebDriver driver;

    @Before
    public void setUp(){

       driver= new FirefoxDriver();
        System.out.println("Lunching browser");
    }

    @Test
    public void navigate(){

        driver.get("https://www.google.co.uk/?gfe_rd=cr&ei=9qT6Vt2dMYbW8AeawImQDQ&gws_rd=ssl");
        System.out.println("open application");
        driver.findElement(By.id("searchText")).sendKeys("way2auto Testing Ltd");//added
    }
    @After
    public void tearDown(){

        driver.close();
        System.out.println("quiting browser");
    }

}