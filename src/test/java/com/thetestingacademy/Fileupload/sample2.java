package com.thetestingacademy.Fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class sample2 {
    @Test
    public void sample1() throws InterruptedException{

        WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");



//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        WebElement choosefile= driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));

        String working=System.getProperty("user.dir");
        System.out.println(working);
        //String path=working+"src"+File.separator+"test"+File.separator+"java"+File.separator+"com"+File.separator+"thetestingacademy"+File.separator+
        //"resource"+File.separator+"text.txt";
        String path=working+"/"+"src/test/java/com/thetestingacademy/resource/CTD1.xlsx";
        System.out.println(path);
        choosefile.sendKeys(path);
        driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();

        //driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();

        Thread.sleep(5000);

        driver.quit();

    }
}
