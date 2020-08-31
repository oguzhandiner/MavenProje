package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day10_isDisplayed {

    static WebDriver webDriver; // instance veriable
    @BeforeClass
    public static void setup(){

        // Driver nesnemizi calistirabilmek icin olusturdugumuz kod.
        WebDriverManager.chromedriver().setup();

        // Driver nesnemizi olusturalim.
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void test01(){
        webDriver.get("https://google.com"); // google gidiyoruz.
        WebElement logo =webDriver.findElement(By.id("hplogo"));
        boolean isDisplayed = logo.isDisplayed(); // WebElement gorunuyor mu?
        Assert.assertTrue(isDisplayed); // WebElement'n gorunup gorunmedigini sorgular.
    }

    @AfterClass
    public static void tearDown(){

        //webDriver.quit(); // calistigimiz tum pencereleri kapatir.
    }
}
