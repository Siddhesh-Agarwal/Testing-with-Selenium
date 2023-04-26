package com.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise3 {
	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-to-name")).sendKeys("Siddhesh Agarwal");
		driver.findElement(By.id("input-to-email")).sendKeys("siddhesh.agarwal@gmail.com");
		driver.findElement(By.id("input-from-name")).sendKeys("Siddhesh Agarwal");
		driver.findElement(By.id("input-from-email")).sendKeys("siddhesh.agarwal@gmail.com");
		driver.findElement(By.id("input-theme-7")).sendKeys("1000");
		driver.findElement(By.className("btn-primary")).click();
	}

}
