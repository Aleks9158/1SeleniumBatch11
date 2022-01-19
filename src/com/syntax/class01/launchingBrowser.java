package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main (String[]args) throws InterruptedException {

       // System.setProperty("webdriver.chrome.driver ","Driver/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver ","C:\\chromedriver\\chromedriver.exe");
        //creating a object of Chrome driver
        WebDriver driver=new ChromeDriver();
        //calling a get method to get to a particular website
        driver.get("http://www.google.com");
        //return the current url loaded in the brow2ser
        String url=driver.getCurrentUrl();
        System.out.println("the current url loaded in browser is:"+url);
//return title of the current page in the browser
        String title = driver.getTitle();
        System.out.println("The current title of the page is :"+title);
        Thread.sleep(2000);
        //close the browser
         driver.quit();
    }
}
