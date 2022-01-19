package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioBtns {
    public static void main(String[] args) {
        // System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        //getting the radio btn webElement
        WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[@value='Female'][@name='optradio']"));
        femaleRadioBtn.click();//этот пункт можно менять как коментарий и потом смотреть результат
        //check if the radio btn is displayed
        boolean isDisplayed=femaleRadioBtn.isDisplayed();
        System.out.println("The  radio btn is displayed on the webPage :"+ isDisplayed);
        //check if the radio btn is enabled
        boolean isEnabled = femaleRadioBtn.isEnabled();
        System.out.println("The  female radio btn is Enabled on the webPage :"+isEnabled);
        //check is female radio btn selected
        boolean isSelected = femaleRadioBtn.isSelected();
        System.out.println("The  female radio btn is Selected on the webPage :"+isSelected );
        //unselect the female radio btn-невозможно т.к нет отмены выбора ,можно только косвенные методы for ex отменить
        //femaleRadioBtn.click();-сделав его коментарием

        //Select the female radio btn only if its Enabled
        if (isEnabled){
            femaleRadioBtn.click() ;
        }
        //after clicking the btn print if its Selested or not
        System.out.println("The  female radio btn is Selected on the webPage :"+isSelected);
    }
}

