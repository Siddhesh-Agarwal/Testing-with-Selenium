package com.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-firstname")).sendKeys("Siddhesh");
		driver.findElement(By.id("input-lastname")).sendKeys("Agarwal");
		driver.findElement(By.id("input-email")).sendKeys("siddhesh.agarwal@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Password123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
}
