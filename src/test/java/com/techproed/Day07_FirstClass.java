package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07_FirstClass {
    public static void main(String[] args) {
        // Browser'lari kullanabilmek icin WebDriverManager ile tanitiyoruz.
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        webDriver.get("https://amazon.com");

        WebElement search = webDriver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("samsung headphones" + Keys.ENTER); // Keys.ENTER komutu klavyemizde ki Enter butonu
        //search.submit();

        WebElement yazi = webDriver.findElement(By.xpath("//span[@dir='auto']"));
        System.out.println(yazi.getText());

        WebElement ilkUrun = webDriver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        System.out.println(ilkUrun.getText());
        //ilkUrun.click();

        List<WebElement> listem = webDriver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        for (WebElement w:listem){
            System.out.println(w.getText());
        }
        //WebElement searchmoto = webDriver.findElement(By.xpath("//input[@type='text']"));
        //searchmoto.submit();
    }
}
