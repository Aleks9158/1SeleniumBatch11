package com.syntax.class02.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver ", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=DB9E3C400747E5B069D28F975ACF6E13");
       driver.navigate().to("http://www.amazon.com");
       Thread.sleep(2000);
        driver.navigate().to("http://www.facebook.com");
        Thread.sleep(2000);
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=DB9E3C400747E5B069D28F975ACF6E13");
        Thread.sleep(3000);
        driver.findElement(By.id("customer.firstName")).sendKeys("moazzams");
        driver.findElement(By.id("customer.lastName")).sendKeys("s9");
        driver.findElement(By.id("customer.address.street")).sendKeys("15 Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("New-York");
        driver.findElement(By.id("customer.address.state")).sendKeys("New-York");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("154322");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("+13230154322");
        driver.findElement(By.id("customer.ssn")).sendKeys("N202154322");
        driver.findElement(By.id("customer.username")).sendKeys("Baltasar");
        driver.findElement(By.id("customer.password")).sendKeys("abcd1234");
        driver.findElement(By.id("repeatedPassword")).sendKeys("abcd1234");
        Thread.sleep(4000);
       // driver.findElement(By.id("Submit")).sendKeys("Register");
        driver.findElement(By.className("button")).click();
       Thread.sleep(4000);
        driver.close();

        //  WebElement TextBox = driver.findElement(By.className("form-control"));
      //  TextBox.sendKeys("abcdefgh");
      //  WebElement username= driver.findElement(By.id("recoveryIdentifierId"));
       // username.sendKeys("Tester");
    }
}

