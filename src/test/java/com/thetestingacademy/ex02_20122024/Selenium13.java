package com.thetestingacademy.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium13 {
    @Test
    public void testMethod01(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");

        //No back,forward allowed in case of get statment.
        //using navigate,to command

        driver.navigate().to("https://thetestingacademy.com");
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println(driver.getTitle());
    }
}
