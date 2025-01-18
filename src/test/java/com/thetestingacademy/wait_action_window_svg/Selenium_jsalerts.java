package com.thetestingacademy.wait_action_window_svg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium_jsalerts {

    @Test
    public void alerts(){
        //selenium only handle js alerts
        //native alerts it won't handle

        WebDriver driver =new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().minimize();

//        WebElement jsal=driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]"));
//        jsal.click();
//


        WebElement js1= driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]"));
        js1.click();


//
//        WebElement js3= driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]"));
//        js3.click();
////

        Alert alert=driver.switchTo().alert();


        //for 3rd one
//        alert.sendKeys("thanu");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        alert.accept();
        alert.dismiss();

        String result =driver.findElement(By.id("result")).getText();
        System.out.println(result);

        driver.quit();


    }
}
