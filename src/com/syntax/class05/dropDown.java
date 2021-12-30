package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.text.html.Option;
import java.util.List;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // navigate to
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
//    find the WebElement "dropdown"
         WebElement days=driver.findElement(By.cssSelector("select#select-demo"));
 //   use the select class to select from drop down
       Select select=new Select(days);
 //  select the value from dropdown using select by index
   //    select.selectByIndex(1);
      //  Thread.sleep(2000);
      // select.selectByIndex(2);
      // Thread.sleep(2000);

      //  select.selectByIndex(7);
   //  select.selectByVisibleText("Thursday");

  //      Select by value for ex. -value="Wednesday"
  //      select.selectByVisibleText("Wednesday");
        List< WebElement> allOptions=select.getOptions();
        int Size=allOptions.size();
        System.out.println(Size);

 //iterate through list all options and get the text of  each option
        for (int i =0; i<Size;i++) {
             String OptionText =allOptions.get(i).getText();
            System.out.println(OptionText);
        }




    }
}
