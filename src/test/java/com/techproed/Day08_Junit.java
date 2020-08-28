package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_Junit {

    @Test
    public void test01(){
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        webDriver.get("https://google.com");
        webDriver.quit();
    }

    @Test
    @Ignore
    public void test02(){
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        webDriver.get("https://amazon.com");
        webDriver.quit();
    }

    @Test
    public void test03(){
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        webDriver.get("https://facebook.com");
        webDriver.quit();
    }


}
