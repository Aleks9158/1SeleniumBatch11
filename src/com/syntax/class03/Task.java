package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main (String[]args) throws InterruptedException {
        // System.setProperty( "webdriver.chrome.driver ","Driver/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
       //driver.findElement(By.xpath("//a[@ id='btn_basic_example' and contains(text(),' Start Practising ' )]"));
       // alertLink.click();
        driver.findElement(By.xpath("//a[contains(@id,'btn_b')]")).click();
        Thread.sleep(2000);
       // WebElement alertLink1=driver.findElement(By.xpath("//a[@class='list-group-item' and contains (text(),'Simple Form Demo')]"));
        //alertLink1.click();
        driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Simple Form Demo']")).click();
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("batchee11");
        driver.findElement(By.xpath("//button[text()=\"Show Message\"]")).click();
}
}
