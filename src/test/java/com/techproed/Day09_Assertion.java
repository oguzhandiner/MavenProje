package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day09_Assertion {

    private static WebDriver webDriver;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void test01(){
        webDriver.get("https://google.com");
        String title = webDriver.getTitle();

        // Assert.assertEquals() Method'u sordugumuz kelime var mi yok mu diye sorar.
        Assert.assertEquals("Arama",title);
    }

    @Test
    public void test02(){
        webDriver.get("https://amazon.com");
        String title = webDriver.getTitle();
         boolean string = title.contains("Amazon");

         Assert.assertTrue(string); // True oldugunu dogrula
    }

    @Test
    public void test03(){
        webDriver.get("https://facebook.com");
        String title = webDriver.getTitle();

        boolean string = title.contains("youtube");
        Assert.assertFalse(string); // False oldugunu dogrula.
    }

    @Test
    public void test04(){
        webDriver.get("https://google.com");
        String title = webDriver.getTitle();

        System.out.println("Merhabalar");

        Assert.assertEquals("Arama",title);

        System.out.println("Test Dogrulama Islemi Bitti");

        // eager test basarisizsa kendisinden sonra ki kismi calistirmiyor.
    }

    @Test
    public void test05(){
        webDriver.get("https://google.com");
        String title = webDriver.getTitle();

        boolean string = title.contains("Google");
        Assert.assertTrue(string);
        System.out.println("Test the End");
    }

    @AfterClass
    public static void tearDown(){
        webDriver.quit();
    }


}
