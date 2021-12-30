package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrder {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver ", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplite11/WebOrders/login.aspx");
        driver.manage().window().maximize();
       WebElement username= driver.findElement(By.id("recoveryIdentifierId"));
       username.sendKeys("Tester");

        driver.findElement(By.id("recoveryIdentifierId")).sendKeys("Tester");
    }
}
