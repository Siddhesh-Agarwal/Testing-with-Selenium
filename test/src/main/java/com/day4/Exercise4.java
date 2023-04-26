package com.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise4 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://j2store.net/free/");
        driver.manage().window().maximize();
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
        Thread.sleep(500);

        driver.navigate().back();
        Thread.sleep(500);

        driver.navigate().forward();
        Thread.sleep(500);

        driver.navigate().refresh();
        Thread.sleep(500);

        driver.close();
        Thread.sleep(500);
    }
}