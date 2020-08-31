package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day10_DropDown {

    static WebDriver webDriver;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void test01(){
        webDriver.get("https://amazon.com");
        WebElement dropDown = webDriver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropDown);

        select.selectByVisibleText("Baby");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        select.selectByValue("search-alias=automotive-intl-ship");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        select.selectByIndex(6);
        WebElement secim = select.getFirstSelectedOption();
        System.out.println(secim.getText());

        List<WebElement> liste = select.getOptions();
        for (WebElement webElement : liste){
            System.out.println(webElement.getText());
        }
        // liste.size() tüm seçeneklerin toplam sayısını size return eder.
        int toplamSecenekSayisi = liste.size();
        System.out.println("Toplam seçim sayısı : " + toplamSecenekSayisi);
    }

    @AfterClass
    public static void tearDown(){
        // webDriver.quit();
    }
}
