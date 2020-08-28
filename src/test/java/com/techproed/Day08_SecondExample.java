package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_SecondExample {

    static WebDriver webDriver;

    @BeforeClass // class calismaya baslayinca calisir.
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @AfterClass // class calismayi bitirince calisir.
    public static void tearDown(){
        webDriver.quit();
    }

    @Before // her test method'ndan once calisacak
    public void testtenOnce(){
        webDriver.get("https://google.com");
    }

    @Test
    public void test01(){
        WebElement searchButton = webDriver.findElement(By.name("q"));
        searchButton.sendKeys("Trabzonspor");
        searchButton.submit();
    }

    @Test
    public void test02(){
        WebElement searchButton = webDriver.findElement(By.name("q"));
        searchButton.sendKeys("Trabzon");
        searchButton.submit();

    }

    @Test
    public void test03(){
        WebElement searchButton = webDriver.findElement(By.name("q"));
        searchButton.sendKeys("Besikduzu");
        searchButton.submit();

    }

    @After // her test method'ndan sonra calisacak
    public void testtenSonra(){
        WebElement sonucSayisi = webDriver.findElement(By.id("result-stats"));
        System.out.println(sonucSayisi.getText());
    }

}
