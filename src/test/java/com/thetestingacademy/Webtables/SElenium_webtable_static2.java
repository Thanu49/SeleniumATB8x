package com.thetestingacademy.Webtables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class SElenium_webtable_static2 {

    @Test
    public void test() throws Exception{

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);

        //find the elements present in the table

        driver.get("https://awesomeqa.com/webtable1.html");

    }
}
