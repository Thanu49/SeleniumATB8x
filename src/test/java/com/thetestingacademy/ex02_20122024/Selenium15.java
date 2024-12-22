package com.thetestingacademy.ex02_20122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium15 {
    @Test
    public void test_selenium() throws Exception{
        //open the https://katalon-demo-cura.herokuapp.com/
        //verify the title and search a string in pagesource
        //add assertion that the cura health care service is visible in the page source

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");


        //Alternate way to maximize

//        WebDriver driver = new EdgeDriver();
//        driver.get("https://katalon-demo-cura.herokuapp.com/");
//        Thread.sleep(5000);
//
//        driver.manage().window().minimize();

        //testng assertions
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");

        //Assertj

        assertThat(driver.getTitle()).isNotBlank().isNotEmpty().isEqualTo("CURA Healthcare Service");
        assertThat(driver.getCurrentUrl()).isEqualTo("https://katalon-demo-cura.herokuapp.com/");

        if (driver.getPageSource().contains("CURA Healthcare Service")){
            Assert.assertTrue(true);
        }else{
            throw new Exception("Heading Not Found");
        }

        driver.quit();
    }
}
