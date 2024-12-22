package com.thetestingacademy.ex01_18122024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium02 {

    @Test
    public void test_selenium(){
        //In selenium 3
        //System.setProperty("webdriver.gecko.driver","path/to/file/firefoxdriver")

        //Selenium 4
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.quit();
    }
}
