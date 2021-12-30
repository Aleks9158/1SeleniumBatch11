package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multippleSelectDD {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    //navigate
       driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
    // find the webElement dropDown
      WebElement stateDD =driver.findElement(By.cssSelector("select#multi-select"));
//    we can use select class so we will make an object of select class
        Select select=new Select(stateDD);
 //    Check if the drop down is multiple
           boolean ismul =select.isMultiple();
        System.out.println(ismul);

        select.selectByIndex(2);
        Thread.sleep (2000);
        select.selectByVisibleText("Texas");
        Thread.sleep (2000);
        select.selectByValue("Ohio");
        Thread.sleep (3000);
        select.deselectByIndex(2);
        Thread.sleep (2000);
        select.deselectByVisibleText("Texas");


        }

      }


