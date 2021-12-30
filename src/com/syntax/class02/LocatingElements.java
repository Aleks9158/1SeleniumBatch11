package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver ", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("moazzams9@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("khlhlupu['ok");
     //   driver.findElement(By.name("pass")).click();
       // driver.findElement(By.linkText("Forgotten password")).click();
        driver.findElement(By.partialLinkText("Forgotten")).click();
        driver.quit();
    }
}
