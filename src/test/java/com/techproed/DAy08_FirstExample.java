package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DAy08_FirstExample {
    static WebDriver webDriver; // instance, diger methodlardan bu nesneye erisebilmek icin.
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void test01(){
        webDriver.get("https://google.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void tes02(){
        webDriver.get("https://youtube.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void tearDown(){
        webDriver.quit();
    }

}
