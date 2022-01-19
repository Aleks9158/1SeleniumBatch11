package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class5 {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();;
//navigate to syntax checkbox demo and check the first checkbox
        driver.get("http://syntaxprojects.com/dynamic-data-loading-demo.php");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       // WebElement newUserOption=driver.findElement(By.xpath("//*[@id='save']"));
        WebElement newUserOption=driver.findElement(By.xpath("/html/head/meta[6]"));
        newUserOption.click();
        driver.quit();
    }
}
