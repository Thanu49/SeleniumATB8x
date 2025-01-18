package com.thetestingacademy.ex04_30122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium21 {

    @Test
    public void checkxpathfunctions(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        //WebElement makeappointment=driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        //WebElement makeappointment=driver.findElement(By.xpath("//a[text()='Make Appointment']"));
        //WebElement makeappointment=driver.findElement(By.xpath("//a[contains(text(),'Make Appointment')]"));
        WebElement makeappointment=driver.findElement(By.xpath("//a[contains(text(),'App')]"));
        //WebElement makeappointment=driver.findElement(By.xpath("//a[starts-with(text(),'Make')]"));

        makeappointment.click();







    }

}
