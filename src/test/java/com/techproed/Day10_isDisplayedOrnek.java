package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day10_isDisplayedOrnek {

    static WebDriver webDriver;

    @Before
    public void setup1(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        webDriver.get("https://bestbuy.com");
    }

    @Test
    public void ornek(){
        String title = webDriver.getTitle();
        boolean string = title.contains("Best");
        Assert.assertTrue(string);
    }

    @Test
    public void logo(){
        WebElement logo = webDriver.findElement(By.className("logo"));
        boolean gorunuyorMu = logo.isDisplayed();
        Assert.assertTrue(gorunuyorMu);
    }

    @Test
    public void mexico(){
        WebElement mexicoLink = webDriver.findElement(By.partialLinkText("Mexico"));
        boolean gorunuyorMu = mexicoLink.isDisplayed();
        Assert.assertTrue(gorunuyorMu);
    }

    @After
    public void tearDown(){
        webDriver.quit();
    }
}
