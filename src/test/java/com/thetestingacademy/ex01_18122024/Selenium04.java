package com.thetestingacademy.ex01_18122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium04 {
    @Test
    public void test_selenium(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.quit();

    }
}
