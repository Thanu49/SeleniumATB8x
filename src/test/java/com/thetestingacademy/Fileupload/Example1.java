package com.thetestingacademy.Fileupload;

import com.thetestingacademy.Actionclass.Pagedown;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;

public class Example1 {

    @Test
    public void sample1() throws InterruptedException{

        WebDriver driver=new EdgeDriver();
        //driver.get("https://the-internet.herokuapp.com/upload");
        driver.get("https://awesomeqa.com/selenium/upload.html");


//        driver.get("https://www.makemytrip.com");
//        driver.manage().window().minimize();

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        WebElement choosefile= driver.findElement(By.xpath("//input[@id=\"fileToUpload\"]"));

        String working=System.getProperty("user.dir");
        System.out.println(working);
        //String path=working+"src"+File.separator+"test"+File.separator+"java"+File.separator+"com"+File.separator+"thetestingacademy"+File.separator+
        //"resource"+File.separator+"text.txt";
        String path=working+"/"+"src/test/java/com/thetestingacademy/resource/CTD1.xlsx";
        System.out.println(path);
        choosefile.sendKeys(path);
        driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();

        //driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();



        driver.quit();

    }

}
