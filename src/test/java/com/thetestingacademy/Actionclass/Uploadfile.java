package com.thetestingacademy.Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Uploadfile {
    @Test
    public void test() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement input=driver.findElement(By.id("fileUpload"));

        String dir=System.getProperty("user.dir");
        System.out.println(dir);

        //drag and drop
        //clickhold and release

    }
    }
