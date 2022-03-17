package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximazeMethod {

    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver ", "Driver/chromedriver.exe");
//        //System.setProperty("webdriver.chrome.driver ", "C:\\chromedriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        //to maximaze window
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        Thread.sleep(4000);
        driver.quit();

    }
}
