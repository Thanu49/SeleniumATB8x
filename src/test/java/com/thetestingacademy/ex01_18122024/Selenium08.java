package com.thetestingacademy.ex01_18122024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium08 {

    @Test
    public void testmethod01(){
        //Edgeoptions -> it will help you set the browser
        //options to browsers
        //window - size
        //headless mode - there is no UI - advantage - fast execution
        //full UI mode default - UI browser
        //incognito mode - switch
        //start max
        //add extensions -browsers
        // 100+ others , httpss,http
        //local storage ,download?

        ChromeOptions edgeOptions = new ChromeOptions();
        //edgeOptions.addArguments("--start-maximixed");
        //edgeOptions.addArguments("--window-size=1200,1500");
        //edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--headless");

        ChromeDriver driver=new ChromeDriver();
        driver.get("https:google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
