package com.thetestingacademy.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium14 {
    @Test
    public void testMethod01() throws InterruptedException{
        EdgeDriver driver = new EdgeDriver();
        //driver.get("sdet.live"); //without http it won't work
        driver.get("www.google.com");
    }

}
