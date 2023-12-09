package com.ucsc.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class EbaySearch {

    WebDriver driver;
    @Test
    public void searchMobilePhone() throws InterruptedException {


        ChromeOptions chromeOptions = new ChromeOptions();
//        driver = new ChromeDriver();
        driver = WebDriverManager.chromiumdriver().capabilities(chromeOptions).create();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("I Phone");
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        Thread.sleep(5000);
        driver.quit();



    }


}
