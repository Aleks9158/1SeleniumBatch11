package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
  // navigate to syntax checkbox demj and check the first checkbox
  driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
  // locate the webelement to checkbox
        WebElement singleCheckBox=driver.findElement(By.cssSelector("input#isAgeSelected"));
  //  check the checkbox
        singleCheckBox.click();
        Thread.sleep(2000);
  //      uncheck the checkbox
        singleCheckBox.click();
 //    Task2 check all the textboxes simultaneously
 // Select a xpath that has common attribute value for all the checkboxes
           List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
  // print the number of checkboxes
        int size=checkBoxes.size();
        System.out.println("The total number of checkboxes is:"+size);
  //    iterate through each WebElement
        for (WebElement checkBox:checkBoxes){
       //select the checkbox with the text Option-3
       // get the attribute "value" of all checkboxes
           String valueofAttribute=checkBox.getAttribute("value");
            System.out.println(valueofAttribute);
    //  check only whose value is "Option -3",для выбора другого checkbox
      // нужно  просто  поменять цифру на 1,2,4.Если надо выбрать всё,
       // нужно изменить equalsIgnoreCase на contains("Option")
      // if (valueofAttribute.equalsIgnoreCase("Option-3")) {
          if (valueofAttribute.contains("Option")) {
    //     click on checkbox whose attribute value is  Option-3
        checkBox.click();

       }

        }

    }
}
