package com.day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise5 {
    public static void main() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://j2store.net/free/");
        driver.manage().window().maximize();

        String url = driver.getCurrentUrl();
        String exp_url = "https://j2store.net/free/index.php/shop?filter_catid=11";
        if (url.equals(exp_url))
            System.out.print("URL matched");
        else
            System.out.print("URL didn't match");
    }
}
